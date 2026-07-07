package recursion_32;

import java.util.Scanner;

public class Factorial {

    public static int getFactorial(int n) {

        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case
        return n * getFactorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to get factorial of that number: ");
        int n = sc.nextInt();

        System.out.println("Factorial is: " + getFactorial(n));

    }
}