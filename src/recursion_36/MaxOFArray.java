package recursion_36;

import java.util.Scanner;

public class MaxOFArray {

    public static int maxInArray(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }

        int smallAns = maxInArray(arr, idx + 1);
        return Math.max(smallAns, arr[idx]);
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

        System.out.println("Maximum of array is: " + maxInArray(arr, 0));

    }
}