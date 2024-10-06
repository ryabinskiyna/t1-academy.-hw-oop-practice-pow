package ru.courses.main;


import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Необходимо передать два аргумента.");
            return;
        }

        double result = calculatePower(args[0], args[1]);
        System.out.println("Результат: " + result);
    }

    public static double calculatePower(String xStr, String yStr) {
        int x = parseInt(xStr);
        int y = parseInt(yStr);

        return pow(x, y);
    }
}
