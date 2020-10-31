package ru.job4j.condition;

public class SqArea {
        public static double square(float p, float k) {
            double h = p / (2 * (k + 1));
            double l = k * h;
            double s = h * l;
            return s;
    }

        public static void main(String[] args) {
            double result = SqArea.square(6, 2);
            System.out.println(" p = 6, k = 2, s = 1, real s = " + result);
    }
}
