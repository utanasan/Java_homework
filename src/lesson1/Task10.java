package lesson1;

/**
 * Дана переменная number
 * Напиши программу которая посчитает квадрат числа в переменной number, сохранит значение в новую созданную переменную и выведет его на экран
 */
public class Task10 {
    public static  int number = 999999999;
    public static void main(String[] args) {
        // you need to use long instead of int, since we have an int(32 bit) overflow
        int square_number = number*number;
        System.out.println(square_number);
    }
}
