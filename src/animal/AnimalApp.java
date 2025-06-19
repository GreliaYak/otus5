package src.animal;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalApp {
    public void AnimalApp() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
        boolean running = true;

        {
            while (running) {
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
            }
                        scanner.close();
        }
    }
}
