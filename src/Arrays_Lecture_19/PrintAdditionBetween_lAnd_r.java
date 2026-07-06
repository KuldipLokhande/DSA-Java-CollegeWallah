package Arrays_Lecture_19;

import java.util.Scanner;

public class PrintAdditionBetween_lAnd_r {

    static int[] makePrefixArray(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            arr[i] = arr[i] + arr[i - 1];

        }

        return arr;
    }

    public static int returnSumBetweenStartAndEnd(int arr[], int start, int end) {

        int ans;

        if (start == 0) {

            ans = arr[end];

        } else {

            ans = arr[end] - arr[start - 1];

        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");

        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the array elements: ");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

        }

        makePrefixArray(arr);

        System.out.println("Enter range of start index: ");

        int start = sc.nextInt();

        System.out.println("Enter range of end index: ");

        int end = sc.nextInt();

        System.out.println(returnSumBetweenStartAndEnd(arr, start, end));

    }

}