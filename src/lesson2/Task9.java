package lesson2;

/**
 * Напиши код метода convertEurToUsd
 * который переводит евро в доллары по заданному курсу
 * Расчет производится по формуле долларСша = евро * курс
 */
public class Task9 {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(100,5));
    }

    public static double convertEurToUsd(int eur, double exchangeRate){
        double usd = eur*exchangeRate;
        return usd;
    }
}
