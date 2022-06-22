package lesson2;

/**
 * Реализуй метод customPrint(String text)
 * Он должен выводить на экран переданную строку 3 раза
 */
public class Task8 {
    public static void main(String[] args) {
        customPrint("Hello");
    }
    public static void customPrint(String text){
        System.out.println(text);
        System.out.println(text);
        System.out.println(text);
    }

}
