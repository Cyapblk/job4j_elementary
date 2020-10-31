package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60F;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
        float in = 140;
        float expeur = 2;
        float expusd = 2.33F;
        float outeur = Converter.rubleToEuro(in);
        float outusd = Converter.rubleToDollar(in);
        boolean passedeur = expeur == outeur;
        boolean passedusd = expusd == outusd;
        System.out.println("140 rubles are 2 euro. Test result : " + passedeur);
        System.out.println("140 rubles are 2.33 dollar Test result : " + passedusd);
    }
}
