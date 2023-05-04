package bonjour;

public class Welcome {

	public static String welcome(String input) {
		if (input == null || input.trim().isEmpty()) {

			return "Hello, my friend";

		}
		if (estEnMajuscule(input)) {
			return gestionCris(input);
		}
		if (contientVirgule(input)) {
			return gestionNoms(input);

		}

		return "Hello, " + capitalize(input);

	}

	private static String capitalize(String name) {

		if (name == null || name.trim().isEmpty()) {

			return "my friend";

		} else {

			char[] char_table = name.toCharArray();

			char_table[0] = Character.toUpperCase(char_table[0]);

			name = new String(char_table);

			return name;

		}
	}

	public static boolean estEnMajuscule(String chaine) {
		for (int i = 0; i < chaine.length(); i++) {
			if (!Character.isUpperCase(chaine.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static String gestionCris(String nom) {
		return "HELLO, " + nom + " !";
	}

	public static String gestionNoms(String noms) {
		String[] parties = noms.split(",");
		String nom1 = parties[0].trim().substring(0, 1).toUpperCase() + parties[0].trim().substring(1).toLowerCase();
		String nom2 = parties[1].trim().substring(0, 1).toUpperCase() + parties[1].trim().substring(1).toLowerCase();
		return "Hello, " + nom1 + ", " + nom2;
	}

	public static boolean contientVirgule(String chaine) {
		return chaine.contains(",");
	}
}
