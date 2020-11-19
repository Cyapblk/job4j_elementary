package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int index = 0; index <= data.length - 1; index++) {
            int min = MinDiapason.minFinderInRange(data, index, data.length - 1);
            int minIndex = FindLoop.index0f(data, min, index, data.length - 1);
            int temp = data[index];
            data[index] = min;
            data[minIndex] = temp;
        }
        return data;
    }
}