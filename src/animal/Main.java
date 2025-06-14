package src.animal;
import java.util.ArrayList;
import java.util.Scanner;

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

        class AnimalApp {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Animal> animals = new ArrayList<>();
            boolean running = true;
            {
                while (running)
                System.out.println("Введите команду (add, list, exit):");
                String command = scanner.nextLine().trim();

                switch (command.toLowerCase()) {
                    case "add":
                        System.out.println("Введите вид животного (cat/dog/duck):");
                        String species = scanner.nextLine().trim().toLowerCase();

                        System.out.println("Введите имя:");
                        String name = scanner.nextLine().trim();

                        System.out.println("Введите возраст:");
                        int age = Integer.parseInt(scanner.nextLine().trim());

                        System.out.println("Введите вес:");
                        double weight = Double.parseDouble(scanner.nextLine().trim());

                        System.out.println("Введите цвет:");
                        String color = scanner.nextLine().trim();

                        Animal animal = null;
                        switch (species) {
                            case "cat":
                                animal = new Cat(name, age, weight, color);
                                break;
                            case "dog":
                                animal = new Dog(name, age, weight, color);
                                break;
                            case "duck":
                                animal = new Duck(name, age, weight, color);
                                break;
                            default:
                                System.out.println("Неверный вид животного");
                                continue;
                        }

                        animals.add(animal);
                        animal.say();
                        break;

                    case "list":
                        for (Animal a : animals) {
                            System.out.println(a.toString());
                        }
                        break;

                    case "exit":
                        running = false;
                        System.out.println("Выход из программы.");
                        break;

                    default:
                        System.out.println("Неизвестная команда");
                }
                scanner.close();
            }
        }
    }
}
