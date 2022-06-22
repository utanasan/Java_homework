package lesson2;

/**
 * Вывести на экран произведение 10 чисел(от 1 до 10)
 * Используй цикл for
 * Результат это одно число
 */
public class Task11 {
    public static void main(String[] args) {
        int multiple = 1;
        for (int i=1; i<=10; i++) {
            multiple*=i;
        }
        System.out.println(multiple);
    }
}
