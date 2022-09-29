package school.lesson5;

import java.util.Arrays;

public class MainClass {

    static String[] words = {"каждый", "охотник", "желает", "знать", "где", "сидит", "фазан"};
    private static final Apple apple1 = new Apple();
    private static final Apple apple2 = new Apple();
    private static final Apple apple3 = new Apple();

    private static final Orange orange1 = new Orange();
    private static final Orange orange2 = new Orange();

    private static final Box<Apple> appleBox1 = new Box<Apple>(apple1, apple2, apple3);
    private static final Box<Orange> orangeBox2 = new Box<Orange>(orange1, orange2);
    private static final Box<Orange> orangeBox3 = new Box<Orange>();

    //Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    public static <T> void swapTwoElementsOfArray(T[] arr, int a, int b) {
        T swap = arr[a];
        arr[a] = arr[b];
        arr[b] = swap;
    }

    public static void main(String[] args) {

        System.out.println("\nЗадача №1. Выведем на печать метод, который меняет два элемента массива местами:");
        System.out.println("массив до изменения: " + Arrays.asList(words));
        swapTwoElementsOfArray(words, 1, 6);
        System.out.println("массив после изменения: " + Arrays.asList(words));

        System.out.println("\nЗадача №2. Методы с фруктами:");
        System.out.println("Вес одного яблока: " + apple1.getWeight());
        System.out.println("Вес одного апельсина: " + orange1.getWeight());
        System.out.println("Вес коробки с 3 яблоками: " + appleBox1.getWeight());
        System.out.println("Вес коробки с 2 апельсинами: " + orangeBox2.getWeight());
        System.out.println("Сравним вес коробки с тремя яблоками и с двумя апельсинами: " + appleBox1.compare(orangeBox2));

        System.out.println("\nПереложим апельсины в другую коробку:");
        System.out.println("в первой коробке лежит " + orangeBox2.getWeight() + " апельсина");
        System.out.println("во второй коробке лежит " + orangeBox3.getWeight() + " апельсинов");
        System.out.println("пересыпаем из первой коробки во вторую и.... магия...");
        orangeBox2.replaceFruitsToAnotherBox(orangeBox3);
        System.out.println("в первой коробке осталось " + orangeBox2.getWeight() + " апельсинов");
        System.out.println("а во второй " + orangeBox3.getWeight() + " апельсина");
    }
}
