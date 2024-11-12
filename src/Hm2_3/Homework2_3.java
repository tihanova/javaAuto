package Hm2_3;

/**
 * Задача 3.
 * Написать программу, которая вычисляет и печатает:
 * • Площадь круга и длину окружности с заданным радиусом.
 * • Посчитать радиус окружности с заданной площадью круга.
 * • Посчитать площадь сектора с заданными радиусом и углом в градусах.
 * Задача 4.
 * Прокомментировать текст какой-либо сделанной вами программы всеми типами комментариев
 */


public class Homework2_3 {
    public static void main(String[] args) {
        // Согласно заданию: значение задать самим в тексте программы
        System.out.printf("Площадь круга при радиусе 2 равна %s!\n", areaCircle(2));
        System.out.printf("Длина окружности  при радиусе 2 равна %s!\n", circleLength(2));
        System.out.printf("Вычисляемый радиус  при площади круга 12 равен %s!\n", calculateRadius(12));
        System.out.printf("Площадь сектора в 180 градусов равна %s!\n", areaSector(2, 180));

    }

    private static double areaCircle(int radius) {
        double area = Math.pow(radius, 2) * Math.PI;
        return area;
    }

    private static double circleLength(int radius) {
        double length = 2 * radius * Math.PI;
        return length;
    }

    /*Использовать класс Math: возведение в степень, квадратный корень, константа Пи и др.*/
    private static double calculateRadius(int square) {
        double radiusFromSquare = Math.sqrt(square / Math.PI);
        return radiusFromSquare;
    }

    private static double areaSector(int radius, int angle) {
        double area = Math.pow(radius, 2) * Math.PI * angle / 360;
        return area;
    }
    //TODO: потом реализовать функцию в случае передаваемого значения в радианах

}