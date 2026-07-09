package recursion_38;

import java.util.Scanner;

public class CheckPalindrome {

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

	public static void isPalindrome(String str) {

		// Reverse the string
		String rev = reverseStr(str, 0);

		// Check palindrome
		if (rev.equals(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		String str = sc.nextLine();

		// Function call
		isPalindrome(str);

	}
}