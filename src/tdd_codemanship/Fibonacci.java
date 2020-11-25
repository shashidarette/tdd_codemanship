package tdd_codemanship;

public class Fibonacci {

	public int getNumber(int index) {
		if (index < 0) {
			throw new IllegalArgumentException();
		}
		
		int[] sequence = new int[index+1];
		
		for (int i = 0; i < sequence.length; i++ ) {
			if (i < 2) {
				sequence[i] = i;
			} else {
				sequence[i] = sequence[i-1] + sequence[i-2];
			}
		}
		
		return sequence[index];
	}

}
