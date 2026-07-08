package recursion_35;

import java.util.Scanner;

public class FindGreatestCommonDivisorofxAndy {

    // Function using Euclid's Algorithm
    public static int printGreatestCommonFactorBetxAndy(int x, int y) {

        // Base case
        if (y == 0) {
            return x;
        }

        // Recursive call using Euclid's Algorithm
        return printGreatestCommonFactorBetxAndy(y, x % y);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();

        System.out.println("Enter the value of y: ");
        int y = sc.nextInt();

        int gcd = printGreatestCommonFactorBetxAndy(x, y);

        System.out.println("Greatest Common Divisor = " + gcd);

    }
}