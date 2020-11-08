package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int total = 1;
        for (int num = 1; num <= n; num++) {
            total = total * num; }
        return total;
    }
}
