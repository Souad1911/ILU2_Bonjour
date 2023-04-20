package bonjour;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void hello_bob() {
		assertEquals(Welcome.welcome("bob"), "Hello bob");
	}

}
