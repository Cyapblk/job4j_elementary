package ru.job4j.calculator;

public class Calculator {
    public static void plus(int A, int B) {
        int result = A + B;
        Calculator.plus(100, 500);
        Calculator.plus(4,2);
        Calculator.plus(3,5);
        System.out.println(result);
    }
}