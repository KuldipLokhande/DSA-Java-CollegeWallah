package recursion_38;

import java.util.Scanner;

public class ReverseString {

	public static String reverseStr(String str, int idx) {

		// Base case
		if (idx == str.length()) {
			return "";
		}

		// Recursive call
		String smallAns = reverseStr(str, idx + 1);

		// Self work

		return smallAns + str.charAt(idx);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();

		System.out.println(reverseStr(str, 0));
	}

}
