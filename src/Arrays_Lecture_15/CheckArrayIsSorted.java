package Arrays_Lecture_15;

import java.util.Scanner;

public class CheckArrayIsSorted {
	
	public static void isSorted(int arr[]) {
		
		boolean sorted = true;

		for(int i = 0; i < arr.length - 1; i++) {

			if(arr[i] > arr[i + 1]) {
				sorted = false;
				break;
			}
		}

		if(sorted) {
			System.out.println("Array is sorted");
		}else {
			System.out.println("Not sorted");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the elements in array: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		isSorted(arr);

	}
}