package Hm2_1;

/**
 * Задача 1.
 * Вывести при помощи одного вызова System.out.printl сразу несколько строк при помощи перевода строки
 * Вывести следующие строки:
 * “30” августа 1903г.
 * C:\Windows\System32\Drivers\etc\hosts
 * Посчитать некоторое выражение и распечатать его результат в виде строки. Вместо 4 – ваш результат:
 * Результат = 4
 */
public class Homework2_1 {
    public static void main(String[] args) {
        double hours = 10;
        printExample(hours);

    }

    private static void printExample(double hours) {

        System.out.println("\"30\" августа 1903г.");
        System.out.println("C:\\Windows\\System32\\Drivers\\etc\\hosts");
        double result = hours * 60;
        System.out.println("Результат = " + result);
    }
}