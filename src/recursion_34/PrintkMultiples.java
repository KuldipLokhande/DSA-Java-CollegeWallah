package recursion_34;

import java.util.Scanner;

public class PrintkMultiples {

    public static void printkMultiples(int n, int k) {

        if (k == 1) {
            System.out.println(n);
            return;
        }

        printkMultiples(n, k - 1);

        System.out.println(n * k);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();

        printkMultiples(n, k);

    }
}