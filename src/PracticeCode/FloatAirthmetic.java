package PracticeCode;

import java.util.Scanner;

public class FloatAirthmetic {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the first float no.: ");
		float a = s.nextFloat();

		System.out.println("Enter the second float no.: ");
		float b = s.nextFloat();

		float sum = 0, sub = 0, mul = 0, div = 0;

		sum = a + b;
		sub = a - b;
		mul = a * b;
		div = a / b;

		System.out.println("Sum of the two float numbers are: " + sum);
		System.out.println("subtraction of the two float numbers are: " + sub);
		System.out.println("muliplication of the two float numbers are: " + mul);
		System.out.println("division of the two float numbers are: " + div);

	}

}
