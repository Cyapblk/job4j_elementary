package ru.job4j.condition;

public class SqAreaVER2 {
    public static double Square (int p, int k){
        int S = p/(2*(k+1)) * k * p / (2 * (k + 1));
        return S;
    }
    public static void main(String[] args){
        double result = SqArea.Square(6,2);
        System.out.println( " p = 6, k = 2, s = 1, real S = " + result);
    }
}

