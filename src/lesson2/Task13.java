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
        //by condition necessary descending
        // 6 if else cases
        //if first, second, third - 2 2 2 ?
        
//         if (first >= second && second >= third) {
//             System.out.println(first + " " + second + " " + third);
//         }
//         //else if
//         else if (second >= first && first >= third) {
//             System.out.println(second + " " + first + " " + third);
//         }
//         else if (third >= second && second >= first) {
//             System.out.println(third + " " + second + " " + first);
//         }
//         else if (third <= second && third <=first && second >= first) {
//             System.out.println(third + " " + first + " " + second);
//         }
           
           if (first >= second && first >= third && second >= third) {
            System.out.println(first + " " + second + " " + third);
        } else if (first >= second && third >= second && first >=third) {
            System.out.println(first + " " + third + " " + second);
        } else if (second >= first && second >= third && first >= third) {
            System.out.println(second + " " + first + " " + third);
        } else if (second >= first && second >= third && third >= first) {
            System.out.println(second + " " + third + " " + first);
        } else if (third >= first && third >= second && first >=second) {
            System.out.println(third + " " + first + " " + second);
        } else if (third >= first && third >= second && second >= first) {
            System.out.println(third + " " +second + " " + first);
        }
    }
}
