package Arrays_Lecture_16;

import java.util.Scanner;

public class FindSecondLargest {

	public static void secondLargest(int arr[]) {

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for(int i = 0; i < arr.length; i++) {

			if(arr[i] > largest) {

				secondLargest = largest;
				largest = arr[i];

			}else if(arr[i] > secondLargest && arr[i] != largest) {

				secondLargest = arr[i];
			}
		}

		System.out.println("Second largest element is: " + secondLargest);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the array elements: ");

		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		secondLargest(arr);

	}
}