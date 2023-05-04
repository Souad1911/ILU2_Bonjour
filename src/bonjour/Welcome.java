package bonjour;

public class Welcome {

	public static String welcome(String input) {
		if (input == null || input.trim().isEmpty()) {

			return "Hello, my friend";

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
}
