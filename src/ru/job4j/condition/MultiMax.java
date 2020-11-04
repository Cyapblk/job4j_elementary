package ru.job4j.condition;

public class MultiMax {
    public static int max(int a, int b, int c) {
        int firststep = a > b ? a : b;
        return (firststep > c ? firststep : c);
        }

    public static void main(String[]args) {
        int rsl = MultiMax.max(1, 2, 3);
        System.out.println(rsl);
    }
}
