package PracticeCode;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Eneter the Number: ");
		int n = s.nextInt();

		int x = 0, sum = 0;
		int temp = 0;
		temp = n;
		while (n != 0) {
			x = n % 10;
			sum = (sum * 10) + x;
			n = n / 10;
		}

		if (sum == temp) {
			System.out.println(temp + " is the palindrome number");
		} else {
			System.out.println(temp + " is not the palindrome number");
		}
	}

}