package Arrays_Lecture_14;

public class CalculateMinElement {

	public static void main(String[] args) {
		int arr[] = { 4, 6, 8, 2, 7, 9, 15, 3 };
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum value of all the elements in given array is: " + min);
	}

}
