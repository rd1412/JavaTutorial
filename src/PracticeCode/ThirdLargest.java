package PracticeCode;

import java.util.Scanner;

public class ThirdLargest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the no. of elements in the array: ");
		int n = s.nextInt();

		int[] a = new int[n];

		System.out.println("Enter the elements of Array: ");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		int first = a[0];
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;

		for (int i = 1; i < n; i++) {
			if (a[i] > first) {
				third = second;
				second = first;
				first = a[i];
			} else if (a[i] >= second && a[i] < first) {
				third = second;
				second = a[i];
			} else {
				third = a[i];
			}
		}

		System.out.println("First Largest Element: " + first);
		System.out.println("Second Largest Element: " + second);
		System.out.println("Third Largest Element: " + third);
	}

}
