package recursion_37;

import java.util.Scanner;

public class ReturnTargetIndex {

    // Method to find target index using recursion
    public static int findTargetIndex(int arr[], int target, int idx) {

        // Base case
        if (idx >= arr.length) {
            return -1;
        }

        // Self work
        if (arr[idx] == target) {
            return idx;
        }

        // Recursive work
        return findTargetIndex(arr, target, idx + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // Input array elements
        System.out.println("Enter the elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target value
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();

        // Store returned index
        int result = findTargetIndex(arr, target, 0);

        // Print result
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found");
        }
    }
}