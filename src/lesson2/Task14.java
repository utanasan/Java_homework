package lesson2;

import java.util.Scanner;

/**
 * Ввести с клавиатуры 3 числа, вывести на экран среднее из них
 * Если все числа равны то нужно вывести любое из них
 */
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a first number: ");
        double first = scanner.nextInt();
        System.out.print("Input a second number: ");
        double second = scanner.nextInt();
        System.out.print("Input a third number: ");
        double third = scanner.nextInt();

        double mean = (first + second + third) / 3;

        if (first == second && first == third && third == second) {
            System.out.println(first);
        } else {
            System.out.println(mean);
        }
    }
}
