package by.behlard.j18.homeworks.hw3;

public class Task2 {
    public static void main(String[] args) {

        int s1 = 1000, s2 = 2000, s3 = 1000;

        int min = s1, max = s1;

        /*if (s2 < min)
            min = s2;
        if (s3 < min)
            min = s3;

        if (s2 > max)
            max = s2;
        if (s3 > max)
            max = s3;*/

        int[] arr = {s1, s2, s3};

        for (int a : arr) {
            if (a < min)
                min = a;
            if (a > max)
                max = a;
        }

        int dif = max - min;

        System.out.println("Разница максимальной и минимальной зарплаты: " + dif);

    }
}
