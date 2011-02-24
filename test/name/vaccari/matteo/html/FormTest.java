package name.vaccari.matteo.html;


import java.util.HashMap;
import java.util.Map;

import name.vaccari.matteo.html.Form;
import name.vaccari.matteo.html.FormElement;
import name.vaccari.matteo.html.TextField;

import org.junit.Test;

import static name.vaccari.matteo.html.Assert.assertDomEquals;

import static org.junit.Assert.*;

import static java.lang.String.format;



public class FormTest {

	@Test
	public void containsWidgets() throws Exception {
		Form form = new Form("/an/action", "get");
		form.add(new FakeWidget("one"));
		form.add(new FakeWidget("two"));
		String expected = "" +
			"<form action='/an/action' method='get'>" +
			"  <widget name='one' />" +
			"  <widget name='two' />" +
			"</form>";
		assertDomEquals(expected, form.toHtml());
	}
	
	@Test
	public void formReturnsAParameterMap() throws Exception {
		Form form = new Form(null, null);
		form.add(new TextField(null, "first field", "first value"));
		form.add(new TextField(null, "second field", "second value"));
		
		Map<String, String> expectedParameters = new HashMap<String, String>();
		expectedParameters.put("first field", "first value");
		expectedParameters.put("second field", "second value");
		assertEquals(expectedParameters , form.getParameters());		
	}
	
	@Test
	public void getTheValueOfATextField() throws Exception {
		Form form = new Form(null, null);
		form.add(new TextField("any label", "foo", "bar"));
		assertEquals("bar", form.getValueOf("foo"));
	}

	public class FakeWidget implements FormElement {
		private final String name;
	
		public FakeWidget(String name) {
			this.name = name;
		}
	
		public String getName() {
			throw new RuntimeException("Not yet implemented!");
		}
	
		public String getValue() {
			throw new RuntimeException("Not yet implemented!");
		}
	
		public void setValue(String value) {
			throw new RuntimeException("Not yet implemented!");
		}
	
		public String toHtml() {
			return format("<widget name='%s'/>", name);
		}
	}
}
