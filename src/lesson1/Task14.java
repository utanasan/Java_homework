package lesson1;

/**
 * Напиши программу которая выводит на экран квадрат числа 5 с помощью метода sqr
 * Подсказка:
 * В class Task14 уже есть метод который считатет квадрат числа
 * Чтобы вызвать этот метод со значением 5  напиши sqr(5)
 */
public class Task14 {
    public static void main(String[] args) {
        System.out.println(sqr(5));
    }

    public static int sqr(int number){
        return number * number;
    }
}
