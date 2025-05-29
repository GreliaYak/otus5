package src;

import src.actions.Fly;

public class Main {
    public static void main(String[] args) {
        // Создаю объект класса и вызовите метод toString()
        Animal animal = new Animal("Бобик", 5, 15, "черный");
        Animal animal1 = new Animal("Бобик", 1, 15, "черный");
        Animal animal2 = new Animal("Бобик", 2, 15, "черный");
        System.out.println(animal.toString());
        System.out.println(animal1.toString());
        System.out.println(animal2.toString());


    }
}