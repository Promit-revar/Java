import java.util.*;
public class random  {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		double r = Math.random();

		int rand = min + (int)( r * ((max - min) + 1));
		System.out.println("Gaussian Random Variable: " + r);
		System.out.println("Random number between given range using Random Variable: " + rand);


	}

}