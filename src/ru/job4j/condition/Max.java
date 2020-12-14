package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = 0;
        return result = left >= right ? left : right;
    }

    public static int max(int first, int second, int third, int fourth) {
        int top = 0;
        return top = max(first, second) >= max(third, fourth) ? max(first, second) : max(third, fourth);
    }

    public static int max(int first, int second, int third) {
        int top = 0;
        return top = max(first, second) >= third ? max(first, second) : third;
    }
}
