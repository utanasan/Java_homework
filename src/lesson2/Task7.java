package lesson2;

/**
 * Написать программу кторая возвращает минимум из четырех чисел
 * Функция min(a,b,c,d) должна вызывать функцию min(a,b)
 */
public class Task7 {
    public static int min(int a, int b, int c, int d){
        int x = min(a,b);
        if (c<d && c<x)
        return c;
        if (d<c && d<x)
            return d;
        else
            return x;
    }
    public static int min(int a, int b){
        return a < b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(min(-20,-10));
        System.out.println(min(-40,-10,-30,40));
        System.out.println(min(-20,-40,-30,40));
        System.out.println(min(-20,-10,-40,40));
        System.out.println(min(-20,-10,-30,-40));
    }
}
