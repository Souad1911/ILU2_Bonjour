package bonjour;

public class Welcome {

	public static String welcome(String input) {

		if (input == null || input.trim().isEmpty()) {

			return "Hello, my friend";

		}
		if (estEnMajuscule(input)) {
			return gestionCris(input);
		}
		if (contientUneVirgule(input)) {
			return gestionNoms(input);

		}
		if (contientPlusieursVirgules(input)) {
			return gestionNomss(input);

		}
		if (contientMaj(input)) {
			return gestionCrisNoms(input);
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

	// public static boolean contientVirgule(String chaine) {
	// return chaine.contains(",");
	// }
	public static boolean contientUneVirgule(String chaine) {
		String[] parties = chaine.split(",");
		return parties.length == 2;
	}

	public static boolean contientPlusieursVirgules(String chaine) {
		String[] parties = chaine.split(",");
		return parties.length > 1;
	}

	public static String gestionNomss(String noms) {
		String[] parties = noms.split(",");
		StringBuilder resultat = new StringBuilder("Hello, ");
		for (int i = 0; i < parties.length; i++) {
			String nom = parties[i].trim().substring(0, 1).toUpperCase() + parties[i].trim().substring(1).toLowerCase();
			resultat.append(nom);
			if (i != parties.length - 1) {
				resultat.append(", ");
			}
		}
		return resultat.toString();
	}

	public static String gestionCrisNoms(String noms) {
		String[] parties = noms.split(",");
		StringBuilder minuscules = new StringBuilder("Hello");
		StringBuilder majuscules = new StringBuilder();
		for (int i = 0; i < parties.length; i++) {
			String nom = parties[i].trim();
			if (nom.toUpperCase().equals(nom)) { // si le nom est enti�rement en majuscules
				if (majuscules.length() > 0) {
					majuscules.append(", ");
				}
				majuscules.append(nom.toLowerCase()).append("!");
			} else {
				if (minuscules.length() > 5) {
					minuscules.append(",");
				}
				minuscules.append(" ").append(nom);
			}
		}
		if (majuscules.length() > 0) {
			minuscules.append(".");
			majuscules.insert(0, " AND HELLO, ");
			minuscules.append(majuscules);
		} else {
			minuscules.append(".");
		}
		return minuscules.toString();
	}

	public static boolean contientMaj(String noms) {
		String[] parties = noms.split(",");
		for (String nom : parties) {
			for (char c : nom.toCharArray()) {
				if (Character.isUpperCase(c)) {
					return true;
				}
			}
		}
		return false;
	}

}
