package PracticeCode;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		int a = s.nextInt();

		System.out.println("Enter the second number: ");
		int b = s.nextInt();

		int sum = 0, sub = 0, mul = 0, div = 0;

		sum = a + b;
		sub = b - a;
		mul = a * b;
		div = b / a;

		System.out.println("Sum of the two numbers are : " + sum);
		System.out.println("Subtraction of the two numbers are : " + sub);
		System.out.println("Multiplication of the two numbers are : " + mul);
		System.out.println("Division of the two numbers are : " + div);

	}

}
