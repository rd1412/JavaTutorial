package PracticeCode;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the No.: ");
		int num = s.nextInt();

		System.out.println("The prime numbers are : ");

		for (int i = 1; i <= num; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count ++;
				}
			}
			if(count == 0) {
				System.out.print(i + " ");
			}

		}

	}

}