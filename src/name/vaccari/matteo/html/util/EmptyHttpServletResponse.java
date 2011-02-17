package name.vaccari.matteo.html.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public class EmptyHttpServletResponse implements HttpServletResponse {

	public void flushBuffer() throws IOException {
		throw new RuntimeException("Not yet implemented!");
	}

	public int getBufferSize() {
		throw new RuntimeException("Not yet implemented!");
	}

	public String getCharacterEncoding() {
		throw new RuntimeException("Not yet implemented!");
	}

	public String getContentType() {
		throw new RuntimeException("Not yet implemented!");
	}

	public Locale getLocale() {
		throw new RuntimeException("Not yet implemented!");
	}

	public ServletOutputStream getOutputStream() throws IOException {
		throw new RuntimeException("Not yet implemented!");
	}

	public PrintWriter getWriter() throws IOException {
		throw new RuntimeException("Not yet implemented!");
	}

	public boolean isCommitted() {
		throw new RuntimeException("Not yet implemented!");
	}

	public void reset() {
		throw new RuntimeException("Not yet implemented!");
	}

	public void resetBuffer() {
		throw new RuntimeException("Not yet implemented!");
	}

	public void setBufferSize(int arg0) {
		throw new RuntimeException("Not yet implemented!");
	}

	public void setCharacterEncoding(String arg0) {
		throw new RuntimeException("Not yet implemented!");
	}

	public void setContentLength(int arg0) {
		throw new RuntimeException("Not yet implemented!");
	}

	public void setContentType(String arg0) {
		throw new RuntimeException("Not yet implemented!");
	}

	public void setLocale(Locale arg0) {
		throw new RuntimeException("Not yet implemented!");
	}

	public void addCookie(Cookie arg0) {
		throw new RuntimeException("Not yet implemented!");
	}

	public void addDateHeader(String arg0, long arg1) {
		throw new RuntimeException("Not yet implemented!");
	}

	public void addHeader(String arg0, String arg1) {
		throw new RuntimeException("Not yet implemented!");
	}

	public void addIntHeader(String arg0, int arg1) {
		throw new RuntimeException("Not yet implemented!");
	}

	public boolean containsHeader(String arg0) {
		throw new RuntimeException("Not yet implemented!");
	}

	public String encodeRedirectURL(String arg0) {
		throw new RuntimeException("Not yet implemented!");
	}

	public String encodeRedirectUrl(String arg0) {
		throw new RuntimeException("Not yet implemented!");
	}

	public String encodeURL(String arg0) {
		throw new RuntimeException("Not yet implemented!");
	}

	public String encodeUrl(String arg0) {
		throw new RuntimeException("Not yet implemented!");
	}

	public void sendError(int arg0) throws IOException {
		throw new RuntimeException("Not yet implemented!");
	}

	public void sendError(int arg0, String arg1) throws IOException {
		throw new RuntimeException("Not yet implemented!");
	}

	public void sendRedirect(String arg0) throws IOException {
		throw new RuntimeException("Not yet implemented!");
	}

	public void setDateHeader(String arg0, long arg1) {
		throw new RuntimeException("Not yet implemented!");
	}

	public void setHeader(String arg0, String arg1) {
		throw new RuntimeException("Not yet implemented!");
	}

	public void setIntHeader(String arg0, int arg1) {
		throw new RuntimeException("Not yet implemented!");
	}

	public void setStatus(int arg0) {
		throw new RuntimeException("Not yet implemented!");
	}

	public void setStatus(int arg0, String arg1) {
		throw new RuntimeException("Not yet implemented!");
	}

}
