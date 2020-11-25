package tdd_codemanship;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class PrimeNumberTests {

	@Test
	public void primeNumbersLessThanOne() {
		assertArrayEquals(null, new PrimeNumberGenerator().getNumbers(1));
	}
	
	@Test
	public void primeNumbersLessThanTwo() {
		assertArrayEquals(new int[] {2}, new PrimeNumberGenerator().getNumbers(2));
	}
	
	@Test
	public void primeNumbersLessThan10() {
		assertArrayEquals(new int[] { 2, 3, 5, 7 }, new PrimeNumberGenerator().getNumbers(10));
	}

}
