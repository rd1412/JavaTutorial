package PracticeCode;

import java.util.Scanner;

public class LeftRotate {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n = s.nextInt();

		System.out.println("Enter the index to rotate: ");
		int d = s.nextInt();

		int[] a = new int[n];
		int[] temp = new int[n];

		System.out.println("Enter the elements in Array: ");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		int k = 0;
		for (int i = d; i < n; i++) {
			temp[k] = a[i];
			k++;
		}

		for (int i = 0; i < d; i++) {
			temp[k] = a[i];
			k++;
		}

		for (int i = 0; i < k; i++) {
			System.out.print(temp[i]+" ");
		}
	}

}
