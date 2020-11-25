package ru.job4j.array;

public class Machine {
    public static int[] rest(int[] coins, int money, int price) {
        int[] result = new int[12];
        int rest = money - price;
        int item = 0;
        for (int index = 0; index <= 3; index++) {
            while (rest >= coins[index]) {
                result[item] = coins[index];
                rest = rest - coins[index];
                item++;
                if (rest < coins[index]) {
                    break;
                }
            }
        }
        int[] cut = new int[item];
        for (int i = 0; i < item; i++) {
            cut[i] = result[i]; }
        return cut;
    }
}