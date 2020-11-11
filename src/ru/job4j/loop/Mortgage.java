package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double dept = amount;
        while (dept > 0) {
           dept = ((dept * (1 + percent / 100)) - salary);
           year++;
        }
        return year;
    }
}
