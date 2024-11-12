package Hm2_6;

import java.util.Scanner;

/**
 * Задача 6.
 * Написать программу, которая просит ввести ваше имя, а затем выводит в консоль приветствие.
 * Для чтения использовать nextLine() Scanner’а.
 */
public class Homework2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();
        printName(name);
    }

    private static void printName(String name) {

        System.out.printf("Привет, %s!", name);
    }
}