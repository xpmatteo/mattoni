package name.vaccari.matteo.http;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class HttpUser {

	public HttpResponse get(String urlString) throws IOException {
		try {
			URL url = new URL(urlString);
			InputStream stream = url.openStream();
			byte[] bytes = new byte[10240];
			int bytesRead = stream.read(bytes);
			String body = (-1 == bytesRead) ? "" : new String(bytes, 0, bytesRead);
			return new HttpResponse(200, body);
		} catch (FileNotFoundException e) {
			return new HttpResponse(404, "");
		}	
	}

}
