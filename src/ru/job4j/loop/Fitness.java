package ru.job4j.loop;

public class Fitness {
    public static int dogon(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            month = month + 1;
            ivan = 3 * ivan * month;
            nik = 2 * nik * month; }
        return month;
    }
}

