package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
        }
        int devider = 1;
        for (int index = 2; index < number; index++) {
            devider++;
            if (number % devider == 0) {
                prime = false;
            break;
            }
        }
        return prime;
    }
}
