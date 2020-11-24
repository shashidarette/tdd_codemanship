package tdd_codemanship;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTests {

	@Test
	void firstNumberInSequenceIsZero() {
		assertEquals(0, new Fibonacci().getNumber(0));
	}
	
	@Test
	void secondNumberInSequenceIsOne() {
		assertEquals(1, new Fibonacci().getNumber(1));
	}

}
