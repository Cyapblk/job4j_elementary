package ru.job4j;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
        int in = 140;
        int expeur = 2;
        int expusd = 2;
        int outeur = Converter.rubleToEuro(in);
        int outusd = Converter.rubleToDollar(in);
        boolean passedeur = expeur == outeur;
        boolean passedusd = expusd == outusd;
        System.out.println("140 rubles are 2 euro. Test result : " + passedeur);
        System.out.println("140 rubles are 2 dollar Test result : " + passedusd);
    }
}
