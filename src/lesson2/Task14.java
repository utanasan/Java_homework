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
        //scanner.nextDouble();
        double first = scanner.nextInt();
        System.out.print("Input a second number: ");
        //scanner.nextDouble();
        double second = scanner.nextInt();
        System.out.print("Input a third number: ");
        //scanner.nextDouble();
        double third = scanner.nextInt();
            //unnecessary calculation
//         double mean = (first + second + third) / 3;

        if (first == second && first == third && third == second) {
            System.out.println(first);
        } else {
            double mean = (first + second + third) / 3;
            System.out.println(mean);
        }
    }
}
