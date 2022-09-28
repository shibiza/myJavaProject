package school.lesson5;

import java.util.Arrays;
import java.util.List;

public class MainClass {

    //Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    public static <T> void swapTwoElementsOfArray(T[] arr, int a, int b) {
        T swap = arr[a];
        arr[a] = arr[b];
        arr[b] = swap;
    }

    public static void main(String[] args) {

        System.out.println("\nЗадача №1. Выведем на печать метод, который меняет два элемента массива местами:");
        String[] words = {"каждый", "охотник", "желает", "знать", "где", "сидит", "фазан"};
        System.out.println(Arrays.asList(words));
        swapTwoElementsOfArray(words, 1, 6);
        System.out.println(Arrays.asList(words));

        System.out.println("\nЗадача №2. Методы с фруктами:");
        Apple apple = new Apple();
        Orange orange = new Orange();
        System.out.println("Вес одного яблока: " + apple.getWeight());
        System.out.println("Вес одного апельсина: " + orange.getWeight());

        Box<Apple> appleBox = new Box<>(apple, 3);
        System.out.println("Вес коробки с 3 яблоками: " + appleBox.getWeight());
        Box<Orange> orangeBox = new Box<>(orange, 2);
        System.out.println("Вес коробки с 2 апельсинами: " + orangeBox.getWeight());

        System.out.println("Сравним вес коробки с яблоками и с апельсинами: ");
        System.out.println(orangeBox.compare(appleBox));

        System.out.println("\nПереложим яблоки в другую коробку:");
        System.out.println("в первой коробке лежит " + appleBox.getWeight() + " яблока");
        Box<Apple> appleBox2 = new Box<>(apple, 0);
        System.out.println("во второй коробке лежит " + appleBox2.getWeight() + " яблок");
        System.out.println("пересыпаем из первой коробки во вторую и.... магия...");
        System.out.println("в первой коробке осталось " + (appleBox.replaceFruitsToAnotherBox(appleBox2)) + " яблок!");
    }
}
