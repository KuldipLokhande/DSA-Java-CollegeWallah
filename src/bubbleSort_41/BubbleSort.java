package bubbleSort_41;

public class BubbleSort {
	public static void bubbleSort(int arr[]) {
		

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 5, 4, 1, 2, 3, 6, 0 };
		bubbleSort(arr);

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
