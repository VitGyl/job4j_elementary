package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        double sumSquares = first + second;
        return Math.sqrt(sumSquares);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(1, 2, 3, 4);
        String result2String = String.format("%.2f", result2);
        System.out.println("result2 (1, 2)  to  (3, 4) " + result2String);
    }
}
