package PracticeCode;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyHashMap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int n = s.nextInt();

		int[] a = new int[n];
		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (freq.containsKey(a[i])) {
				freq.put(a[i], freq.get(a[i]) + 1);
			} else {
				freq.put(a[i], 1);
			}
		}

		System.out.println();
		for (int i : freq.keySet()) {
			System.out.println("Element: " + i + " Frequecy: " + freq.get(i));
		}

		System.out.println("Repeatative Element : ");

		for (int i : freq.keySet()) {
			if (freq.get(i) > 1) {
				System.out.print(a[i] + " ");
			}
		}

	}

}
