package CAT1.Pack1;
import java.util.*;

public class Extract {

	int [] arr;
	void extractDigits(int n) {
		int l = (int)Math.floor(Math.log10(n) + 1);
		arr = new int [l];
		int i = 0;
		while (n > 0) {
			arr[i] = n % 10;
			n = n / 10;
		}
		System.out.println("Extracted");

	}
}