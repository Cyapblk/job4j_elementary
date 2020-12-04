package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int a = 0;
        int b = 0;
        int counter = 0;
        int rl = right.length;
        while (a < left.length && b < right.length) {
            if (left[a] < right[b]) {
                rsl[counter] = left[a];
                counter++;
                a++;
            } else {
                rsl[counter] = right[b];
                counter++;
                b++;
            }
        }
        while (a < left.length) {
            rsl[counter] = left[a];
            counter++;
            a++;
        }
        while (b < right.length) {
            rsl[counter] = right[b];
            counter++;
            b++;
        }
        return rsl;
    }
}