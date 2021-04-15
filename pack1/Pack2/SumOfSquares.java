package CAT1.Pack1.Pack2;
import CAT1.Pack1.*;
public class SumOfSquares {

	void printSumofSquares(int n) {
		Extract e = new Extract();
		e.extractDigits(n);
		int []a = e.arr;
		int s = 0;
		for (int i : a) {
			s += (i * i);
		}

		System.out.println("Sum of Sqaures: " + s);

	}

}