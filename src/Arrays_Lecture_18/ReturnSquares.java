package Arrays_Lecture_18;

import java.util.Scanner;

public class ReturnSquares {
	
	public static void returnSquaresOfArr(int arr[]) {
		
		System.out.println("Given array is: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("Squares of given elements are: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]*arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the elements in array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		returnSquaresOfArr(arr);
	}

}
