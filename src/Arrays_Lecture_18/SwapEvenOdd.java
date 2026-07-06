package Arrays_Lecture_18;

public class SwapEvenOdd {

	public static void swap(int arr[], int left, int right) {

		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;

	}

	public static void swapEvenOdd(int arr[]) {

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {

			if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {

				swap(arr, left, right);
				left++;
				right--;

			}

			if (arr[left] % 2 == 0) {
				left++;
			}

			if (arr[right] % 2 != 0) {
				right--;
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 2, 3, 5, 6, 8, 9 };

		swapEvenOdd(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}