package Array;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n = s.nextInt();

		int[] a = new int[n];
		int[] freq = new int[100];

		System.out.println("Enter the elements in Array: ");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		for (int i = 0; i < 100; i++) {
			freq[i] = 0;
		}

		for (int i = 0; i < n; i++) {
			freq[a[i]]++;
		}

		System.out.println("Printing elements of Array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		System.out.println("Printing elements of Frequency Array: ");
		for (int i = 0; i < 100; i++) {
				System.out.print(freq[i] + " ");
		}
	}
}