package src;

public class Cat extends Animal{

    public Cat(String name, int age, int weight, String color) {
        super (name, age, weight, color);

        // Создание класса Cat, наследуемого от Animal
            @Override
            void Say() {
                System.out.println("Мяу");
            }
        }
    }
