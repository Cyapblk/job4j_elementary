package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberofDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Tuesday", "Вторник" -> 2;
            case "Wednesday", "Среда" -> 3;
            case "Thursday", "Четверг" -> 4;
            case "Friday", "Пятница", "金曜日" -> 5;
            case "Saturday", "Суббота" -> 6;
            case "Sunday", "Восскресение" -> 7;
            default -> -1;
        };
    }

    public static void main(String[]ars) {
        System.out.println(MultipleSwitchWeek.numberofDay("Monday"));
        System.out.println(MultipleSwitchWeek.numberofDay("Четверг"));
        System.out.println(MultipleSwitchWeek.numberofDay("Sunday"));
        System.out.println(MultipleSwitchWeek.numberofDay("Понедельник"));
        System.out.println(MultipleSwitchWeek.numberofDay("Восскресение"));
        System.out.println(MultipleSwitchWeek.numberofDay("金曜日") + " японский тоже работает");
        System.out.println(MultipleSwitchWeek.numberofDay("завтра"));
    }
}
