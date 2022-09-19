package ru.job4j;

public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);

        int six             = 6;
        int four            = 4;
        int five            = 5;
        int sixDivTwo       = six / two;
        int fiveMinusTwo    = five - two;
        int fourTimeTwo     = four * two;

        System.out.println("sixDivTwo= " + sixDivTwo + "\n" + "fiveMinusTwo= " + fiveMinusTwo + "\n"
                + "fourTimeTwo= " + fourTimeTwo);

        int result3 = ru.job4j.MathFunc.func1(100);
        System.out.println("result3= " + result3);
        short s = 1501;
        char c = (char) s;
        double d = c;
        System.out.println(" i " + d);

    }

}
