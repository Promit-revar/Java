package CAT1.Pack1.Pack2;
import CAT1.Pack1.*;
public class Sum {

	void printSum(int n) {
		Extract e = new Extract();
		e.extractDigits(n);
		int []a = e.arr;
		int s = 0;
		for (int i : a) {
			s += i;
		}

		System.out.println("Sum: " + s);

	}
}


