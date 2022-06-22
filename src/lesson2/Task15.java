package lesson2;

import java.util.Scanner;

/**
 * Вводить с клавиатуры числа, если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершиь программу
 * -1 не должно учитываться в сумме
 *
 */
public class Task15 {
    public static void main(String[] args) {
        int first=0;
        int sum=0;
        Scanner scanner = new Scanner(System.in);

        while (first != -1) {
            System.out.print("Input a number: ");
            first = scanner.nextInt();
            sum+=first;
        }
        System.out.println(sum-first);
    }
}

