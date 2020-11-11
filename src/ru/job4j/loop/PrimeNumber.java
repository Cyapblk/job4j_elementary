package ru.job4j.loop;

public class PrimeNumber {
    public static int qty(int finish) {
        int counter = 0;
        for (int index = 1; index <= finish; index++) {
            if (CheckPrimeNumber.check(index) ) {
                counter++;
            }
        }
        return counter;
    }
}

