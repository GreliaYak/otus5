package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Animal (){

    public Animal(String... args) {

            private String name;
            private int age;
            private int weight;
            private String color;

             // Геттеры и сеттеры
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

             // Методы
             public static void say() {
                 System.out.println("Я говорю");
             }

             public static void go() {
                 System.out.println("Я иду");
             }

             public static void drink() {
                 System.out.println("Я пью");
             }

             public static void eat() {
                 System.out.println("Я ем");
             }

             // Переопределение toString
        @Override
        public String toString() {
            String ageUnit;
            int ageMod100 = age % 100;
            int ageMod10 = age % 10;
            if (ageMod100 >= 11 && ageMod100 <= 14) {
                ageUnit = "лет";
            } else {
                switch (ageMod10) {
                case 1:
                    ageUnit = " год";
                    break;
                case 2:
                case 3:
                case 4:
                    ageUnit = " года";
                    break;
                default:
                    ageUnit = " лет";
                    
                }
            }
            return String.format("Привет! Меня зовут %s, мне %d%s, я вешу - %d кг, мой цвет - %s", name, age, ageUnit, weight, color);
        }

    public void fly() {
            void fly();
        }

        // add list
        enum Command {
            ADD, LIST, EXIT;

            public static Command fromString(String input) {
                switch (input.trim().toLowerCase()) {
                    case "add":
                        return ADD;
                    case "list":
                        return LIST;
                    case "exit":
                        return EXIT;
                    default:
                        return null;
                }
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Animal> animals = new ArrayList<>();

            while (true) {
                System.out.print("Enter command (add/list/exit): ");
                String input = scanner.nextLine();
                Command command = Command.fromString(input);

                if (command == null) {
                    System.out.println("Invalid command. Try again.");
                    continue;
                }

                switch (command) {
                    case ADD:
                        System.out.print("Enter animal type (cat/dog/duck): ");
                        String typeInput = scanner.nextLine().trim().toLowerCase();
                        Class<? extends Animal> animalClass = null;

                        switch (typeInput) {
                            case "cat":
                                animalClass = Cat.class;
                                break;
                            case "dog":
                                animalClass = Dog.class;
                                break;
                            case "duck":
                                animalClass = Duck.class;
                                break;
                            default:
                                System.out.println("Unknown animal type.");
                                continue;
                        }

                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter age: ");
                        int age = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter weight: ");
                        double weight = Double.parseDouble(scanner.nextLine());
                        System.out.print("Enter color: ");
                        String color = scanner.nextLine();

                        Animal animal = null;
                        try {
                            if (animalClass == Cat.class) {
                                animal = new Cat(name, age, weight, color);
                            } else if (animalClass == Dog.class) {
                                animal = new Dog(name, age, weight, color);
                            } else if (animalClass == Duck.class) {
                                animal = new Duck(name, age, weight, color);
                            }
                        } catch (Exception e) {
                            System.out.println("Error creating animal: " + e.getMessage());
                            continue;
                        }

                        animals.add(animal);
                        animal.Say();
                        break;

                    case LIST:
                        if (animals.isEmpty()) {
                            System.out.println("No animals in the list.");
                        } else {
                            for (Animal a : animals) {
                                System.out.println(a.toString());
                            }
                        }
                        break;

                    case EXIT:
                        System.out.println("Exiting program.");
                        scanner.close();
                        return;
                }
            }
        }
    }
}



