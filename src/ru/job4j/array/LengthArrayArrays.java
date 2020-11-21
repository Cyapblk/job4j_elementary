package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {4, 6}, {7, 8, 9}, {1, 2, 3, 4}};
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("Размер вложенного массива = " + numbers[index].length);
        }
    }
}
