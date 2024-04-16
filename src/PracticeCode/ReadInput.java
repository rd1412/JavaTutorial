package PracticeCode;

import java.util.Scanner;

public class ReadInput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Read input as String: ");
		String st = s.nextLine();

		System.out.println("Read input as Integer: ");
		int Integer = s.nextInt();

		System.out.println("Read input as Float: ");
		float f = s.nextFloat();

		System.out.println("Integer: " + Integer);
		System.out.println("String: " + st);
		System.out.println("Float: " + f);
	}

}
