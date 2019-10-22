package by.behlard.j18.homeworks.hw3;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        int[] arr = {1, 5, 81, 13, 8, 11, -9, 27, 0, 7};
        int sum = 0;

        for (int a : arr)
            sum += a;

        double avg = (double) sum / arr.length;

        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);

        Arrays.sort(arr);



    }
}
