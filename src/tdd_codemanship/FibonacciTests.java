package tdd_codemanship;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class FibonacciTests {
	@Test
	@Parameters({"0,0", "1,1"})
	public void firstTwoNumbersAsIndex(int index, int expected) {
		assertEquals(expected, getFibonacciNumber(index));
	}
	
	@Test
	public void thirdNumberInSequenceIsOne( ) {
		assertEquals(1, getFibonacciNumber(2));
	}
	
	@Test
	public void fourthNumberInSequenceIsTwo() {
		assertEquals(2, getFibonacciNumber(3));
	}
	
	private Object getFibonacciNumber(int index) {
		return new Fibonacci().getNumber(index);
	}
}
