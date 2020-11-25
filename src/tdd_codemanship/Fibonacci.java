package tdd_codemanship;

public class Fibonacci {

	public int getNumber(int index) {
		if (index < 0) {
			throw new IllegalArgumentException();
		}
		
		if (index < 2) {
			return index;
		}
		
		return getNumber(index - 1) + getNumber(index - 2);
	}

}
