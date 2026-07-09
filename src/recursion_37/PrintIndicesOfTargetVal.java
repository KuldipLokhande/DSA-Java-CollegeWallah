package recursion_37;

import java.util.Scanner;

public class PrintIndicesOfTargetVal {

    public static void returnIndicesOfTarget(int arr[], int target, int idx) {

        // Base case
        if (idx >= arr.length) {
            return;
        }

        // Self work
        if (arr[idx] == target) {
            System.out.print(idx+" ");
        }

        // Recursive work
        returnIndicesOfTarget(arr, target, idx + 1);
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

        System.out.println("Enter the target value: ");
        int target = sc.nextInt();

        // Print all indices of target
        System.out.println("Indices of target value:");
        returnIndicesOfTarget(arr, target, 0);

    }
}