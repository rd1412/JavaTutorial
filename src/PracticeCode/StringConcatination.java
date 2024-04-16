package PracticeCode;

import java.util.Scanner;

public class StringConcatination {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the first string: ");
		String str1 = s.nextLine();

		System.out.println("Enter the second string: ");
		String str2 = s.nextLine();

		String str = str1 + " " + str2;
		System.out.println("Concatenated String is : " + str);

	}

}