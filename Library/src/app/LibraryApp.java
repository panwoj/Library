package app;

public class LibraryApp {
	public static void main(String[] args) {
		final String appName = "Biblioteka v0.7";
		System.out.println(appName);
		LibraryControl lc = new LibraryControl();
		lc.controlLoop();
	}
}
