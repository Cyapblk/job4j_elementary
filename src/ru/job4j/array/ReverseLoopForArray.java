package ru.job4j.array;

public class ReverseLoopForArray {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int index = 0; index < input.length - 1; index++) {
            if ((input.length - 1 - index) % 2 == 0) {
                System.out.println(input[input.length - 1 - index]);
            }
        }
    }
}
