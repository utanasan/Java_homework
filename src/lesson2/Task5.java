package lesson2;

/**
 * Создай объект типа Cat, Dog, Fish и Woman
 * Присвой каждому питомцу своего владельца
 */
public class Task5 {
    public static void main(String[] args) {
        Woman alisa = new Woman();
        Woman nika = new Woman();
        Woman helen = new Woman();
        Cat bars = new Cat();
        bars.owner = alisa;
        Dog ralf = new Dog();
        ralf.owner = nika;
        Fish fish = new Fish();
        fish.owner = helen;
    }
    public static class Cat{
        public Woman owner;
    }
    public static class Dog{
        public Woman owner;
    }
    public static class Fish{
        public Woman owner;
    }
    public static class Woman{

    }
}
