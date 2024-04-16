package PracticeCode;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the No: ");
		int count = s.nextInt();

		int a = 0, b = 1;
		System.out.println("Fibonnaci Series: ");
		System.out.print(a + " " + b + " ");

		int sum = 0;
		for (int i = 3; i <= count; i++) {
			sum = a + b;
			System.out.print(sum + " ");
			a = b;
			b = sum;
		}

	}

}
