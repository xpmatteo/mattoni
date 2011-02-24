package name.vaccari.matteo.html;

public interface FormElement {

	String getName();
	String getValue();
	void setValue(String value);
	String toHtml();

}
