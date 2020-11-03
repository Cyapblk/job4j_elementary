package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean top = left >= right;
        int result = top ? left : right;
        return result;
    }

    public static void main(String[]args) {
        int outcome = Max.max(8, 3);
        System.out.println(outcome);
    }
}
