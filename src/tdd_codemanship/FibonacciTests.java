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
		assertEquals(expected, new Fibonacci().getNumber(index));
	}
	
	@Test
	public void thirdNumberInSequenceIsOne( ) {
		assertEquals(1, new Fibonacci().getNumber(2));
	}
}
