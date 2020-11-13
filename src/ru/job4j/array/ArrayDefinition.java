package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println(ages.length);
        String[] surnames = new String[100500];
        System.out.println(surnames.length);
        float[] prices = new float[40];
        System.out.println(prices.length);
        String[] names = new String[4];
        names[0] = "Jordano Bruno";
        names[1] = "Eugeny Petrosyan";
        names[2] = "Ponty Pilat";
        names[3] = "先生";
        System.out.println(names[3]);
    }
}
