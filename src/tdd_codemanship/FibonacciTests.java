package tdd_codemanship;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTests {

	@Test
	void firstNumberInSequenceIsZero() {
		assertEquals(0, new Fibonacci().getNumber(0));
	}

}
