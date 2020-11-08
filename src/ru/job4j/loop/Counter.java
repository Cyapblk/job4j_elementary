package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int num = start; num <= finish; num++) {
            sum = sum + num;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int num = start; num <= finish; num++) {
            if (num % 2 == 0) {
                sum = sum + num;
            }
        }
        return sum;
    }
}

