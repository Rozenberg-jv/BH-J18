package by.behlard.j18.homeworks.hw3;

import java.util.Arrays;

public class Task6 {

	public static void main(String[] args) {

		int[] a = new int[] {30, 18, 21, 19, 19, 11, 5, 7, 5, 17};
		int sum = 0;

		for (int i : a)
			sum += i;

		double avg = (double) sum / a.length;

		System.out.println("sum: " + sum);
		System.out.println("average: " + avg);

		Arrays.sort(a);
		double median = a.length % 2 == 0 ? ((double) a[a.length / 2 - 1] + a[a.length / 2]) / 2 : a[a.length / 2];

		System.out.println("median: " + median);

	}
}
