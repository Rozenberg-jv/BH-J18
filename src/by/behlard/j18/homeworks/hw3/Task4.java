package by.behlard.j18.homeworks.hw3;

public class Task4 {

	public static void main(String[] args) {

		double startSum = 1000;
		double proc = 10;
		int years = 5;

		double result = startSum;

		for (int i = 0; i < years; i++)
			result += result * proc / 100;

		System.out.println(result);
	}
}
