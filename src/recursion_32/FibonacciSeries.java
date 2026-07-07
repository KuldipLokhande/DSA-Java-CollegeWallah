package recursion_32;

import java.util.Scanner;

public interface FibonacciSeries {

    public static int fib(int number) {

        if (number == 1 || number == 0) {
            return number;
        }

        int result = fib(number - 1) + fib(number - 2);

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        System.out.println("Fib of number " + number + " is: " + fib(number));
    }
}
