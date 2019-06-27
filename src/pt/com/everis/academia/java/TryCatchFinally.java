package pt.com.everis.academia.java;

public class TryCatchFinally {

	public void a() throws Exception {

	}

	public void b(String string) {
		throw new NullPointerException();
	}

	public void c() {
		try {
			b(null);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
