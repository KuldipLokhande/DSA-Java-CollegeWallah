package Arrays_Lecture_14;

public class CalculateMaxElement {

	public static void main(String[] args) {

		int arr[] = { 4, 6, 8, 2, 7, 9, 15, 3 };
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum value of all the elements in given array is: " + max);
	}

}
