package ru.job4j.array;

public class JustArray {
    public static int whole(int[]massive) {
        int rsl = 0;
        for (int index = 0; index < massive.length; index++) {
            rsl = rsl + massive[index];
        }
        return rsl;
    }
}
