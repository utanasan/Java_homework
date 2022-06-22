package lesson2;

/**
 * Напиши код метода sumDigitsInNumber(int number)
 * Метод принимает на вход целое трехзначное число
 * Нужно посчитать сумму цифр этого числа и вернуть эту сумму
 */
public class Task12 {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(456));
    }

    public static int sumDigitsInNumber(int number) {
        int x = number / 100;
        int y = number / 10 - 10 * x;
        int z = number - 100 * x - 10 * y;
        return x + y + z;
    }
}
