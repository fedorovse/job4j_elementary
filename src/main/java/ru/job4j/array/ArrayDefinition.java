package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Sergey";
        names[1] = "Ivan";
        names[2] = "Inchik";
        names[3] = "Nikolay";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println();

        System.out.println("Количество элементов в массиве ages: " + ages.length);
        System.out.println("Количество элементов в массиве surnames: " + surnames.length);
        System.out.println("Количество элементов в массиве prices: " + prices.length);
    }
}
