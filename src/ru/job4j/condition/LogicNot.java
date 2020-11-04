package ru.job4j.condition;

public class LogicNot {
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean notEven(int num) {
        return num % 2 != 0;
    }

    public boolean notpositive(int num) {
        return num < 0;
    }

    public boolean notEvenAndPostitive(int num) {
        return (num % 2 != 0 && num > 0);
    }

    public boolean evenOrNotPositive(int num) {
        return (notpositive(num) || isEven(num));
    }
}

