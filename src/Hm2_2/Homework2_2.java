package Hm2_2;

/**
 * Задача 2.
 * Посчитайте на Java следующие выражения
 */
public class Homework2_2 {
    public static void main(String[] args) {
        calculate();
    }

    private static void calculate() {
        double x = 3 - (56 - 12) / 44 * 4 / 2;
        double y = 2 * x / (33 - x);
        double z = -x / (2 * y);
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("Z = " + z);
    }
}