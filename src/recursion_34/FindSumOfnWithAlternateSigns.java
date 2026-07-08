package recursion_34;

import java.util.Scanner;

public class FindSumOfnWithAlternateSigns {

    public static int printSumWithAlternateSigns(int n) {
        if (n == 1) {

            return n;
        }
        if (n % 2 == 0) {
            return printSumWithAlternateSigns(n - 1) - n;
        }

        return printSumWithAlternateSigns(n - 1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println(printSumWithAlternateSigns(n));
    }

}
