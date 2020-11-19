package ru.job4j.array;

public class Min {
    public static int minFinder(int[] field) {
        int min = field[0];
        for (int index = 1; index < field.length; index++) {
            if (min > field[index]) {
                min = field[index];
            }
        }
    return min;
    }
}
