package name.vaccari.matteo.html.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class FakeResponse extends EmptyHttpServletResponse {
	
	private StringWriter stringWriter = new StringWriter();
	private PrintWriter writer = new PrintWriter(stringWriter);

	@Override
	public PrintWriter getWriter() throws IOException {
		return writer ;
	}

	public String toHtml() {
		return stringWriter.toString();
	}

}
