package lesson2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * С консоли считывается первое число - это размер массива, потом числами из консоли заполняется этот массив на заданный размер
 * Написать сортировку пузырьком для этого массива, вывести на экран массив до сортировки и после сортировки
 */
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size: ");
        int size = scanner.nextInt();
        int mas[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Input a number: ");
            int element = scanner.nextInt();
            mas[i] = element;
        }
        System.out.println(Arrays.toString(mas));


        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }

            
        }
        System.out.println(Arrays.toString(mas));

    }
}
