package name.vaccari.matteo.http;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;

public class HttpUserTest {

	@Test
	public void returns404() throws Exception {
		HttpUser user = new HttpUser();
		HttpResponse response = user.get("http://localhost/notexistent");
		assertEquals(404, response.getStatus());
	}
	
	@Test
	public void returns200() throws Exception {
		HttpUser user = new HttpUser();
		HttpResponse response = user.get("http://localhost/");
		assertEquals(200, response.getStatus());
		assertThat(response.getBody(), containsString("<html xmlns"));
	}

}
