package lesson1;

/**
 * Дана переменная number
 * Напиши программу которая посчитает квадрат числа в переменной number, сохранит значение в новую созданную переменную и выведет его на экран
 */
public class Task10 {
    public static  int number = 999999999;
    public static void main(String[] args) {

        int square_number = number*number;
        System.out.println(square_number);
    }
}
