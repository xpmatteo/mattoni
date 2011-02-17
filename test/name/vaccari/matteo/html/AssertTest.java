package name.vaccari.matteo.html;


import org.junit.Test;

import static name.vaccari.matteo.html.Assert.assertDomEquals;

public class AssertTest {

	@Test
	public void ignoresSmallDifferences() {
		String one = "<div id='foo'></div>";
		String two = "<div id=\"foo\" />";
		
		assertDomEquals(one, two);
		assertDomEquals("some message", one, two);
	}

}
