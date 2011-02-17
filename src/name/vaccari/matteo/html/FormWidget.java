package name.vaccari.matteo.html;

public interface FormWidget {

	String getName();
	String getValue();
	void setValue(String value);
	String toHtml();

}
