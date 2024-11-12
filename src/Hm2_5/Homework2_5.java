package Hm2_5;

import java.util.Scanner;

/**
 * Задача 5.
 * Написать программу, читающую с консоли длину и ширину
 * прямоугольника, и печатающую его площадь
 * • * Посчитайте и периметр
 * • Считать, что длина и ширина – вещественные числа
 */
public class Homework2_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника:");
        double lengthRectangle = scanner.nextDouble();
        System.out.println("Введите ширину прямоугольника:");
        double widthRectangle = scanner.nextDouble();

        System.out.printf("Площадь прямоугольника равна: %.2f\n", areaRectangle(lengthRectangle, widthRectangle));
        System.out.printf("Периметр прямоугольника равен: %.2f\n", perimeterRectangle(lengthRectangle, widthRectangle));

    }

    private static double areaRectangle(double a, double b) {
        double s = a * b;
        return s;
    }

    private static double perimeterRectangle(double a, double b) {
        double p = (a + b) * 2;
        return p;
    }
}