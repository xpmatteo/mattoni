package name.vaccari.matteo.html;

import java.util.Map;

import static java.lang.String.format;

abstract class InputField implements FormWidget {
	private String type;
	private String name;
	private String value;
	private String label;
	
	public InputField(String label, String type, String name, String value) {
		this.label = label;
		this.type = type;
		this.name = name;
		this.value = value;
	}

	public String toHtml() {
		String template = "<p>%s:<br/><input type='%s' name='%s' value='%s' /></p>";
		return format(template, label, type, name, value);
	}

	public void addTo(Map<String, String> map) {
		map.put(name, value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}		
}