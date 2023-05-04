package bonjour;

public class Main {

	public static void main(String[] args) {
		Welcome nouvelle = new Welcome();
		System.out.println(nouvelle.gestionNomss("amy , bob , jerry"));
		System.out.println(nouvelle.gestionCrisNoms("amy , BOB , jerry"));

	}

}
