package name.vaccari.matteo.http;

public class HttpResponse {

	public static final int OK = 200;
	private final int status;
	private final String body;

	public HttpResponse(int status, String body) {
		this.status = status;
		this.body = body;
	}

	public HttpResponse(String body) {
		this.status = OK;
		this.body = body;
	}

	public int getStatus() {
		return status;
	}

	public String getBody() {
		return body;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		result = prime * result + status;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof HttpResponse))
			return false;
		HttpResponse other = (HttpResponse) obj;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
}
