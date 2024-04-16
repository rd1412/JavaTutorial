package PracticeCode;

import java.util.Scanner;

public class PetersonNumber {

	static int fact(int num) {
		int f = 1;
		for (int i = 2; i <= num; i++) {
			f = f * i;
		}
		return f;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = s.nextInt();

		int x = 0, temp = 0;
		temp = n;
		int sum = 0;
		while (n != 0) {
			x = n % 10;
			sum = sum + fact(x);
			n = n / 10;
		}

		if (sum == temp) {
			System.out.println(temp + " is the Peterson number");
		} else {
			System.out.println(temp + " is not the Peterson number");
		}
	}

}
