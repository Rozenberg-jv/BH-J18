package by.behlard.j18.lessons.lesson3;

public class Loops {
    public static void main(String[] args) {

        int[] intArray = {1, 3, 7, -11, 8};

        for (int i = 0; i < intArray.length; i++)
            System.out.print(intArray[i] + " ");
        System.out.println();
        for (int i = intArray.length - 1; i >= 0; i--)
            System.out.print(intArray[i] + " ");
        System.out.println();
        for (int i = intArray.length; i > 0; i--)
            System.out.print(intArray[i - 1] + " ");
        System.out.println();
        for (int i : intArray)
            System.out.print(i);
        System.out.println("\n");

        // 2d array
        int[][] arrayD = {{1, 2, 3, 4, 5}, {4, 3}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

        for (int i = 0; i < arrayD.length; i++) {
            for (int j = 0; j < arrayD[i].length; j++) {
                System.out.print(arrayD[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] ar : arrayD) {
            for (int i : ar) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
