package Array;

import java.util.Scanner;

public class ArrayPrint {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n = s.nextInt();

		int a[] = new int[n];
		int b[] = new int[n];

		System.out.println("Enter the elements in Array: ");

		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		System.out.println("Printing elements of First Array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			b[i] = a[i];
		}

		System.out.println("Printing elements of Second Array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(b[i] + " ");
		}
	}

}