package name.vaccari.matteo.html;
import static java.lang.String.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Form implements HtmlRenderer {

	private final String action;
	private final String method;
	private final List<FormWidget> fields = new ArrayList<FormWidget>();

	public Form(String action, String method) {
		this.action = action;
		this.method = method;
	}

	public void add(FormWidget field) {
		fields.add(field);
	}

	public Map<String, String> getParameters() {
		Map<String, String> result = new HashMap<String, String>();
		for (FormWidget field : fields) {
			if (null != field.getName()) {
				result.put(field.getName(), field.getValue());
			}
		}
		return result ;
	}

	public String getMethod() {
		return method;
	}

	public String getAction() {
		return action;
	}

	public String getValueOf(String fieldName) {
		return fieldWithName(fieldName).getValue();
	}

	public void setValueOf(String fieldName, String fieldValue) {
		fieldWithName(fieldName).setValue(fieldValue);
	}

	public String toHtml() {
		StringBuilder result = new StringBuilder();
		result.append(startTag("form"));
		for (FormWidget field : fields) {
			result.append(field.toHtml());
		}
		result.append(endTag("form"));
		return result.toString();
	}

	private String endTag(String name) {
		return format("</%s>", name);
	}

	private String startTag(String name) {
		return format("<%s action='%s' method='%s'>", name, action, method);
	}

	private FormWidget fieldWithName(String fieldName) {
		for(FormWidget field : fields) {
			if (field.getName().equals(fieldName))
				return field;
		}
		return null;
	}
}
