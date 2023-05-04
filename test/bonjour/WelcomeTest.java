package bonjour;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void hello_bob() {

		assertEquals(Welcome.welcome("bob"), "Hello, Bob");

	}

	@Test
	void hello_friend() {
		assertEquals("Hello, my friend", Welcome.welcome(null));

	}

	@Test
	void gestionCris() {
		assertEquals(Welcome.welcome("JERRY"), "HELLO, JERRY !");

	}
}
