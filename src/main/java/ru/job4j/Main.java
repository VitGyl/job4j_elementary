package ru.job4j;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Привет мир");
        //age это возраст
        int age = 49;

        //sex это пол
        char sex = 'F';

        //height это рост
        //по задаче измерение в метрах, поэтому float с возможностью десятичных дробей
        float height = (float) 1.70;

        //bricksAmount это количество кирпичей для постройки дома (небольшой одноэтажный дом площадью 100м2)
        short bricksAmount;

        //bactAmount это количество бактерий (измерять будем в КОЕ / г - такую величину можно встретить если почитать состав обычного йогурта,
        // часто там можно встретить число 1 * 107 КОЕ / г)
        float bactAmount = 379645;

        //spaceDistance это расстояние до космических объектов (измерять будем в км)
        double spaceDistance = 10e32;

        //workLicense это разрешение на работу (рассматриваем всего 2 значения - или есть разрешение или его нет)
        boolean workLicense = false;

        //fileSize это размер файла (измерять будем в байтах)
        long fileSize = 36589;
    }
}