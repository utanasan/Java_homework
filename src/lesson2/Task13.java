package lesson2;

import java.util.Scanner;

/**
 * Ввести с клавиатуры три числа  и вывести их в порядке убывания
 * Выведенные числа должны быть разделены пробелом
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a first number: ");
        int first = scanner.nextInt();
        System.out.print("Input a second number: ");
        int second = scanner.nextInt();
        System.out.print("Input a third number: ");
        int third = scanner.nextInt();

        if (first < second && first < third && second < third) {
            System.out.println(first + " " + second + " " + third);
        }
        if (second < first && second < third && first < third) {
            System.out.println(second + " " + first + " " + third);
        }
        if (third < second && third < first && second < first) {
            System.out.println(third + " " + second + " " + first);
        }
        if (third < second && third < first && second > first) {
            System.out.println(third + " " + first + " " + second);
        }


    }
}
