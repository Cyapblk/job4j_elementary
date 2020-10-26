package ru.job4j.condition;

public class SqArea {
    public static double Hight (int p, int k){
        int h = p/(2*(k+1));
        return h;
    }
    public static double Lenght (int p, int k) {
    int L = k * p / (2 * (k + 1));
    return L;
    }
    public static double Square (int p, int k){
        int S = p/(2*(k+1)) * k * p / (2 * (k + 1));
        return S;
}
public static void main(String[] args){
            double result1 = SqArea.Hight(6,2);
            double result2 = SqArea.Lenght(6,2);
            double result3 = SqArea.Square(6,2);
            System.out.println( " p = 6, k = 2, s = 1, real h = " + result1);
            System.out.println( " p = 6, k = 2, s = 1, real L = " + result2);
            System.out.println( " p = 6, k = 2, s = 1, real S = " + result3);
    }
}
