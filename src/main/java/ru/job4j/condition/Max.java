package ru.job4j.condition;

public class Max {
    public static void main(String[] args) {
        maxOfTwo(12, 10);
    }

    static int maxOfTwo(int left, int right) {
        int result = left > right ? left : right;
        System.out.println("result = " + result);
        return result;
    }
}
