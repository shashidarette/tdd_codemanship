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
	public void firstFourNumbersAsIndex(int index, int expected) {
		assertEquals(expected, getFibonacciNumber(index));
	}
	
	@Test
	@Parameters({"2,1", "3,2"})
	public void thirdNumberOnIndexMinusOne(int index, int expected) {
		assertEquals(expected, getFibonacciNumber(index));
	}
		
	private Object getFibonacciNumber(int index) {
		return new Fibonacci().getNumber(index);
	}
}
