package recursion_36;

import java.util.Scanner;

public class ArrayRecursion {

    public static void printArray(int arr[], int idx) {

        // Base case
        if (idx == arr.length) {
            return;
        }

        // Print current element
        System.out.println(arr[idx]);

        // Recursive call
        printArray(arr, idx + 1);
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

        // Start recursion from index 0
        printArray(arr, 0);


    }
}