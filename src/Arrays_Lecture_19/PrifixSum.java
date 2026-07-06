package Arrays_Lecture_19;

import java.util.Scanner;

public class PrifixSum {

    public static int[] prifixSum(int arr[]) {

        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {

            prefix[i] = prefix[i - 1] + arr[i];

        }

        return prefix;
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

        int result[] = prifixSum(arr);

        System.out.println("Prefix Sum Array:");

        for (int i = 0; i < result.length; i++) {

            System.out.print(result[i] + " ");

        }
    }
}