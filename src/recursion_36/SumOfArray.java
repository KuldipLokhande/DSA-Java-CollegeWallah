package recursion_36;

import java.util.Scanner;

public class SumOfArray {

    public static int sumOfArray(int arr[], int idx) {
        // Base case
        if (idx == arr.length - 1) {
            return arr[idx];
        }

        // Recursive call
        int smallAns = sumOfArray(arr, idx + 1);

        // Add current element
        return arr[idx] + smallAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sum of array elements is: " + sumOfArray(arr, 0));

    }
}