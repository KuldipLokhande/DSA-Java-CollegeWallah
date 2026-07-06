package Arrays_Lecture_17;

import java.util.Scanner;

public class SwapTwoVar {

	public static void swapVariables(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;

		System.out.println("Swapped value of a is: " + a);
		System.out.println("Swapped value of b is: " + b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();

		System.out.println("Enter the value of b: ");
		int b = sc.nextInt();

		System.out.println("Inserted value of a is: " + a);
		System.out.println("Inserted value of b is: " + b);
		swapVariables(a, b);
	}

}
