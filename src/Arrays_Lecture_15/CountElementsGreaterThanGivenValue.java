package Arrays_Lecture_15;

import java.util.Scanner;

public class CountElementsGreaterThanGivenValue {

	public static void checkGreaterNumbersCount(int arr[], int givenNum, int count) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > givenNum) {
				count++;
			}
		}
		System.out.println("The number of elements srictly greater than given number is: " + count);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the elements in array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the value to count the numbers strictly greater than this number: ");
		int givenNum = sc.nextInt();
		int count = 0;
		
		checkGreaterNumbersCount(arr, givenNum, count);

	}

}
