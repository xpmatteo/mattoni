package name.vaccari.matteo.html;

import java.io.IOException;
import java.io.StringReader;

import org.custommonkey.xmlunit.XMLAssert;
import org.custommonkey.xmlunit.XMLUnit;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import static org.junit.Assert.*;
import static java.lang.String.*;

public class Assert {

	public static void assertDomEquals(String expected, String actual) {
		assertDomEquals(actual, expected, actual);
	}

	public static void assertDomEquals(String message, String expected, String actual)  {
		try {
			XMLUnit.setControlEntityResolver(ignoreDoctypesResolver());
			XMLUnit.setTestEntityResolver(ignoreDoctypesResolver());
			XMLUnit.setIgnoreWhitespace(true);
			XMLAssert.assertXMLEqual(message, ignoreEntities(expected), ignoreEntities(actual));
		} catch (Exception e) {
			fail(format("Malformed input: '%s'", actual));
		}
	}

	private static String ignoreEntities(String text) {
		return text.replaceAll("&", "&amp;");
	}

	public static EntityResolver ignoreDoctypesResolver() {
		return new EntityResolver() {
		    public InputSource resolveEntity(String publicId, String systemId)
		        throws SAXException, IOException {
		        return new InputSource(new StringReader(""));
		    }
		};
	}
}
