package recursion_33;

import java.util.Scanner;

public class SumOfDigitsFrom1To_n {

	public static int sumOfDigitsfrom1Ton(int num) {
		if (num == 0 || num == 1) {
			return num;
		}

		int result = num + sumOfDigitsfrom1Ton(num - 1);
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int num = sc.nextInt();

		System.out.println("Sum of digits is: " + sumOfDigitsfrom1Ton(num));
	}

}
