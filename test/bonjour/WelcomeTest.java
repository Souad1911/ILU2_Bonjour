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
	@Test 
	void ajouterAnd() {
		
	}
	@Test 
	void gestionEspace() {
		assertEquals(Welcome.welcome("bob   ,amy  "), "Hello, Bob and Amy");
	}
	@Test 
	void gestionRepetitions() {
		assertEquals(Welcome.welcome("bob, JERRY, amy, bob, JERRY, bob"), "Hello, Bob(x3) and Amy.AND HELLO, JERRY (x2) !");
		
	}
	

}
