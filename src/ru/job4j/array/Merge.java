package ru.job4j.array;

public class Merge {
    public class Merge {
        public static int[] merge(int[] left, int[] right) {
            int[] rsl = new int[left.length + right.length];
            int counter = 0;
        while (counter < rsl.length) {
            int lft = 0;
            int rght = 0;
            if (left[lft] < right[rght] && left[lft + 1] < right[rght + 1]) {
                rsl[counter] = left[lft];
                counter++;
                lft++;
            }

            while (left[lft] > right[rght] && left[lft + 1] > right[rght + 1]) { // 2
                rsl[counter] = right[rght];
                counter++;
                rght++;
            }

            while (left[lft] > right[rght] && left[lft + 1] < right[rght + 1]) { //
                rsl[counter] = right[rght];
                counter++;
                lft++;
            }

            while (left[lft] < right[rght] && left[lft + 1] > right[rght + 1]) { //
                rsl[counter] = left[lft];
                counter++;
                rght++;
            }
        }
        return rsl;
    }
}