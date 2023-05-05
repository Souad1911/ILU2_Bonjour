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
			if (nom.toUpperCase().equals(nom)) { // si le nom est entièrement en majuscules
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
	//fonction pour ajouter and iter7 
		public static String ajouterAnd(String noms) {
		    String[] listeNoms = noms.split(",");
		    int longueur = listeNoms.length;
		    String message = "Hello";
		    if (longueur == 1) {
		      message += ", " + listeNoms[0].trim();
		    } else if (longueur == 2) {
		      message += ", " + listeNoms[0].trim() + " and " + listeNoms[1].trim();
		    } else {
		      for (int i = 0; i < longueur - 1; i++) {
		        message += ", " + listeNoms[i].trim();
		      }
		      message += " and " + listeNoms[longueur - 1].trim();
		    }
		    message += "!";
		    return message;
		  }
		
		public static String gestionEspaces (String chaine) {
			String[] names = chaine.split(","); // Séparer les noms par la virgule
	        String output = "Hello, ";
	        
	        for (int i = 0; i < names.length; i++) {
	            String name = names[i].trim(); // Supprimer les espaces inutiles autour des noms
	            if (i == 0) {
	                output += capitalizerNom(name); // Mettre en majuscule la première lettre du premier nom
	            } else {
	                output += " and " + capitalizerNom(name); // Ajouter "and" avant les autres noms
	            }
	        }
	        
	        return output;
	    }
		public static String capitalizerNom(String str) {
	        if (str == null || str.isEmpty()) {
	            return str;
	        } else {
	            return str.substring(0, 1).toUpperCase() + str.substring(1);
	        	}
	    }
		public static boolean contientEspaces(String str) {
		    if (str == null) {
		        return false;
		    }
		    for (int i = 0; i < str.length(); i++) {
		        if (str.charAt(i) == ' ') {
		            return true;
		        }
		    }
		    return false;
		}
		
		//pour iterations9
		public static String compterNoms(String noms) {
		    String[] nomsArray = noms.split(",");
		    int n = nomsArray.length;

		    String[] distinctNoms = new String[n];
		    int[] counts = new int[n];
		    int distinctCount = 0;

		    // Parcourt la liste de noms et on  met à jour le tableau des noms distincts et le tableau des occurrences
		    for (int i = 0; i < n; i++) {
		        String nom = nomsArray[i].trim().toLowerCase();
		        boolean alreadyCounted = false;

		        for (int j = 0; j < distinctCount; j++) {
		            if (nom.equals(distinctNoms[j])) {
		                counts[j]++;
		                alreadyCounted = true;
		                break;
		            }
		        }

		        if (!alreadyCounted) {
		            distinctNoms[distinctCount] = nom;
		            counts[distinctCount] = 1;
		            distinctCount++;
		        }
		    }

		    // Crée la chaîne de message à renvoyer en appelant la méthode privée createMessage
		    String message = createMessage(distinctNoms, counts, distinctCount);

		    return message;
		}

		private static String createMessage(String[] noms, int[] counts, int distinctCount) {
		    // Crée la chaîne de message à renvoyer
		    String message = "Hello";
		    for (int i = 0; i < distinctCount; i++) {
		        message += " " + noms[i].substring(0, 1).toUpperCase() + noms[i].substring(1);
		        if (counts[i] > 1) {
		            message += " (x" + counts[i] + ")";
		        }

		        if (i < distinctCount - 2) {
		            message += ", ";
		        } else if (i == distinctCount - 2) {
		            message += " AND ";
		        }
		    }

		    message += "!";

		    return message;
		}
		public static boolean verifierRepetitions(String chaine) {
		    String[] parties = chaine.split(",");
		    int n = parties.length;

		    for (int i = 0; i < n - 1; i++) {
		        for (int j = i + 1; j < n; j++) {
		            if (parties[i].trim().equalsIgnoreCase(parties[j].trim())) {
		                return true;
		            }
		        }
		    }

		    return false;
		}

}
