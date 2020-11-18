package ru.job4j.array;

public class Min {
    public static int minFinder(int[] field) {
        int min = field[0];
        for (int index = 0; index <= field.length - 2; index++) {
            if (min > field[index + 1]) {
                min = field[index + 1];
            }
        }
    return min;
    }
}
