package Arrays_Lecture_15;

import java.util.Scanner;

public class FindElementsOccurrenceOfLastIndex {

	public static void lastOccurrence(int arr[], int checkLastOccurrence) {
		int lastOccurrence = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == checkLastOccurrence) {
				lastOccurrence = i;
			}
		}
		System.out.println("Last occurrence of " + checkLastOccurrence + " is: " + lastOccurrence);
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

		System.out.println("Enter the number to check the lastOccurrence: ");
		int checkLastOccurrence = sc.nextInt();
		
		lastOccurrence(arr, checkLastOccurrence);

	}

}
