package Arrays_Lecture_20;

import java.util.Scanner;

public class TransposeMatrix {
	public static void printMatrix(int arr[][], int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void findTranspose(int arr[][], int rows, int columns) {

		int transpose[][] = new int[columns][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				transpose[j][i] = arr[i][j];
			}
		}

		System.out.println("Transpose matrix is:");
		printMatrix(transpose, columns, rows);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows size: ");
		int rows = sc.nextInt();
		System.out.println("Enter the columns size: ");
		int columns = sc.nextInt();

		int arr[][] = new int[rows][columns];
		int totalElements = rows * columns;

		System.out.println("Enter " + totalElements + " elements value in array: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Original matrix is: ");
		printMatrix(arr, rows, columns);

		findTranspose(arr, rows, columns);
	}

}
