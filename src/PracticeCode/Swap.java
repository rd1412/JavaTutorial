package PracticeCode;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the first no.: ");
		int a = s.nextInt();
		System.out.println("Enter the second no.: ");
		int b = s.nextInt();

		int temp = 0;

		temp = b;
		b = a;
		a = temp;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
