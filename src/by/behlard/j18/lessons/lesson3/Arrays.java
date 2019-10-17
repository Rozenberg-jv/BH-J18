package by.behlard.j18.lessons.lesson3;

public class Arrays {

    public static void main(String[] args) {

        int[] array1 = {5, 6, 8, -10, 11};

        System.out.println(array1[3]);

        array1[0] = 100;

        System.out.println(array1[0]);

        int[] array2 = new int[3];
        System.out.println(array2[0]);

        boolean[] boolArray = new boolean[3];
        System.out.println(boolArray[2]);

        int[][] arrayD = new int[3][];
        arrayD[0] = new int[]{15, 2, 0};
        arrayD[1] = new int[2];
        arrayD[2] = new int[4];
        arrayD[1][0] = 5;
        arrayD[1][1] = -55;

        int[] arrayInner = arrayD[1];
        arrayInner[0] = 1000;

        System.out.println(arrayD[1][0]);
    }
}
