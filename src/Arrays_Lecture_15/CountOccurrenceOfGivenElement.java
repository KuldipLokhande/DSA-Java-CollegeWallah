package Arrays_Lecture_15;

import java.util.Scanner;

public class CountOccurrenceOfGivenElement {
	
	public static int countOccurrence() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the elemens in array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the element which you want to count the occurance of that element: ");
		int countOccurrence=sc.nextInt();
		
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==countOccurrence) {
				count++;
			}
		}
		System.out.print("Occurrence of given element is: ");
		return count;
		}

	public static void main(String[] args) {
		 
		System.out.println(countOccurrence());
		
	}

}
