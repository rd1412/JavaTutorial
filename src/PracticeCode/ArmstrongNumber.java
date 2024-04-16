package PracticeCode;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First no.: ");
		int a = s.nextInt();

		System.out.println("Enter the Second no.: ");
		int b = s.nextInt();

		for (int i = a; i <= b; i++) {

			int sum = 0, temp = 0, x = 0;
			temp = i;
			while (temp != 0) {
				x = temp % 10;
				sum = sum + (x * x * x);
				temp = temp / 10;

			}
			if (sum == i) {
				System.out.println(i + " is the Armstrong no.");
			}
		}

	}

}
