package src.animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Бобик", 5, 15, "черный");
        Animal animal1 = new Animal("Бобик", 1, 15, "черный");
        Animal animal2 = new Animal("Бобик", 2, 15, "черный");

        System.out.println(animal.toString());
        animal.say();
        animal.go();
        animal.eat();
        animal.drink();

        System.out.println(animal1.toString());
        animal.say();
        animal.go();
        animal.eat();
        animal.drink();

        System.out.println(animal2.toString());
        animal.say();
        animal.go();
        animal.eat();
        animal.drink();

        Cat cat = new Cat("Васька", 3, 4.5, "Мейн-кун");
        cat.say();

        Dog dog = new Dog("Алиса", 4, 5.5, "Курцхаар");
        dog.say();

        Duck duck = new Duck("Фрея", 1, 2, "Селезень");
        duck.say();
        duck.fly();
    }
}