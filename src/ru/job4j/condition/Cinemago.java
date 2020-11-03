package ru.job4j.condition;

public class Cinemago {
    public static void permission(boolean allowbyparents, boolean hasmoney) {
        if (allowbyparents && hasmoney) {
            System.out.println("I can go to the cinema");
        } else {
            System.out.println("I can't.");
        }
    }

        public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
