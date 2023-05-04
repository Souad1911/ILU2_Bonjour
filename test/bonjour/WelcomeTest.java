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

	@Test
	void gestionNoms() {
		assertEquals(Welcome.welcome(" amy,bob"), "Hello, Amy, Bob");

	}

	@Test
	void gestionNomss() {
		assertEquals(Welcome.welcome("Amy, bob, jerry"), "Hello, Amy, Bob, Jerry");

	}

	@Test
	void gestionCrisNoms() {
		assertEquals(Welcome.welcome("amy, BOB, Jerry"), "Hello, Amy, Jerry.AND HELLO, BOB!");

	}

}
