package ru.job4j.array;

public class Machine {
    public static int[] rest(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[12];
        int rest = money - price;
        for (int resultindex = 0; resultindex < 3; resultindex++) {
            for (int coinsindex = 0; coinsindex <= 3; coinsindex++) {
            while (rest >= coins[coinsindex]) {
                    result[resultindex] = coins[coinsindex];
                    rest = rest - coins[coinsindex];
                    resultindex++;
                    if (rest < coins[coinsindex]) {
                        break;
                    }
                }
            }
        }
        return result;
    }
}