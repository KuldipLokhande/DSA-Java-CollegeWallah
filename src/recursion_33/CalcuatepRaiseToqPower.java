package recursion_33;

import java.util.Scanner;

public class CalcuatepRaiseToqPower {

	public static int pow(int p, int q) {
		if (q == 0) {
			return 1;
		}

		return pow(p, q - 1) * p;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of p: ");
		int p = sc.nextInt();

		System.out.println("Enter the value of q: ");
		int q = sc.nextInt();
		System.out.println(pow(p, q));
	}

}
