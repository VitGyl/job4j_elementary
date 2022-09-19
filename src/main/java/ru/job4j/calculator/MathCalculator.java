package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20) + "\n"
                + "Результат суммы разности и деления равен: " + difAndDiv(10, 20) + "\n"
                + "Результат суммы всех четырех операций равен: " + theSumOfAllFourCalc(10, 20));
    }

    public static double difAndDiv(double first, double second) {
        return MathFunction.difference(first, second)
                + MathFunction.division(first, second);
    }

    public static double theSumOfAllFourCalc(double first, double second) {
        return MathCalculator.sumAndMultiply(first, second) + MathCalculator.difAndDiv(first, second);
    }
}
