package Arrays_Lecture_16;

import java.util.Scanner;

public class AddttionOfTwoElementsWhichMeetsTargetValue {
	
	public static void checkAdditionOfTwoElementsIsEqualToTarget(int arr[], int target) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+ " "+arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size: ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the elements of array :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the target value: ");
		int target=sc.nextInt();
		
		checkAdditionOfTwoElementsIsEqualToTarget(arr, target);
	}
}
