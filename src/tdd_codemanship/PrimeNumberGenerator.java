package tdd_codemanship;

import java.util.ArrayList;
import org.apache.commons.lang3.ArrayUtils;

public class PrimeNumberGenerator {

	public int[] getNumbers(int maxNumber) {
		if (maxNumber <= 1) {
			return null;
		}
		
		ArrayList<Integer> numbersList = new ArrayList<Integer>();
		
		numbersList.add(2);
		for (int n = 3; n <= maxNumber; n++) {
			if (n % 2 != 0) {
				numbersList.add(n);
			}
		}
		
		return  ArrayUtils.toPrimitive(numbersList.toArray(new Integer[0]));
	}

}
