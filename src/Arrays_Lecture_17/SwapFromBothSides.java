package Arrays_Lecture_17;

import java.util.Scanner;

public class SwapFromBothSides {
	
	public static void swapInArray(int arr[], int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void swapElements(int arr[]) {

		int i = 0;
		int j = arr.length - 1;
		
		while(i < j) {

			swapInArray(arr, i, j);

			i++;
			j--;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the elements of array: ");

		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		swapElements(arr);

		System.out.println("Array after swapping from both sides:");

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		
	}
}