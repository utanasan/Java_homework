package lesson2;

/**
 * Написать функцию которая возвращает минимум из двух чисел
 */
public class Task6 {
    public static int min(int a, int b){
        return a < b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(min(12,33));
        System.out.println(min(-20,0));
        System.out.println(min(-10,-20));
    }
}
