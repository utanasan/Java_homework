package lesson2;

/**
 * Метод convertCelsiusToFahrenheit принимает значение в градусах цельсия
 * Метод должен переводить температуру и возвращать значение градусов в фаренгейтах
 * Температура по цельсию связана с температурой по фаренгейту следующим отношением
 * TF=(9/5) * TC + 32
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius){
        double TF;
        TF=(celsius*9)/5 + 32;

        return TF;
    }
}
