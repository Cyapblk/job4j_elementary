package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int tem = array[0];
        array[0] = array[3];
        array[3] = tem;

        int temp = array[1];
        array[1] = array[2];
        array[2] = temp;

        int tempo = array[3];
        array[3] = array[4];
        array[4] = tempo;

        for (int range : array) {
            System.out.println(range);
        }
    }
}
