package ru.job4j.array;

public class MinDiapason {
    public static int minFinderInRange(int[] field, int start, int finish) {
        int min = field[start];
        for (int index = start; index <= finish - 1;  index++) {
            if (min > field[index + 1]) {
                min = field[index + 1];
            }
        }
    return min;
    }
}

