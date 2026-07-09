package recursion_38;

import java.util.Scanner;

public class RemoveOccurrences {

	public static String removeOccurrences(String str, char ch, int idx) {

		if (idx == str.length()) {
			return "";
		}

		String smallAns = removeOccurrences(str, ch, idx + 1);
		char currChar = str.charAt(idx);

		if (currChar != ch) {
			return currChar + smallAns;
		} else {
			return smallAns;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		String str = sc.nextLine();

		System.out.println("Enter the charactor which you want to remove from the string: ");
		char ch = sc.next().charAt(0);

		System.out.println(removeOccurrences(str, ch, 0));
	}

}
