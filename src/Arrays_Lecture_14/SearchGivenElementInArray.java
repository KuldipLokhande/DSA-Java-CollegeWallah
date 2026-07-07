package Arrays_Lecture_14;

import java.util.Scanner;

public class SearchGivenElementInArray {

	public int searchElement(int searchElement, int arr[], int size) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchElement) {
				return arr[i];
			}
		}
		return -1;
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

		System.out.println("Enter the searching element: ");
		int searchElement = sc.nextInt();
		
		
		SearchGivenElementInArray s=new SearchGivenElementInArray();
		int result=s.searchElement(searchElement, arr, size);
		System.out.println(result);

	}

}
