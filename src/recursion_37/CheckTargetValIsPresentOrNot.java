package recursion_37;

import java.util.Scanner;

public class CheckTargetValIsPresentOrNot {

	public static boolean searchTarget(int arr[], int target, int idx) {
		// base case
		if (idx >= arr.length) {
			return false;
		}

		// self work
		if (arr[idx] == target) {
			return true;
		}

		// recursive work
		if (searchTarget(arr, target, idx + 1)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();

		System.out.println("Enter the target value: ");
		int target = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the elements in array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		if (searchTarget(arr, target, 0)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
