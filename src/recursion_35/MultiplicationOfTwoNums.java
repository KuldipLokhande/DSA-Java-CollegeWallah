package recursion_35;

import java.util.Scanner;

public class MultiplicationOfTwoNums {

	public static int printMultiplecation(int x, int y) {

		if (x == 0 || y == 0) {
			return 0;
		}

		printMultiplecation(x - 1, y - 1);

		return x * y;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of x: ");
		int x = sc.nextInt();

		System.out.println("Enter the value of y: ");
		int y = sc.nextInt();

		System.out.println("Multiplication of x and y is: " + printMultiplecation(x, y));
	}

}
