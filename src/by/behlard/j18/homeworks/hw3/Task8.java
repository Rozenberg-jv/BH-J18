package by.behlard.j18.homeworks.hw3;

public class Task8 {

	public static void main(String[] args) {

		int[][] arrayD = new int[4][];
		int c = 1;

		for (int i = 0; i < arrayD.length; i++) {
			arrayD[i] = new int[i + 1];
			for (int j = arrayD[i].length - 1; j >= 0; j--) {
				arrayD[i][j] = c;
				c *= 2;
			}
		}

		for (int[] ar : arrayD) {
			for (int a : ar)
				System.out.print(a + " ");
			System.out.println();
		}
	}
}
