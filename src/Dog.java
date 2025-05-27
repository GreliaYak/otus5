package src;

public class Dog extends Animal{


    public Dog (String name, int age, int weight, String color) {
        super(name, age, weight, color);

        // Создание класса Dog, наследуемого от Animal
            @Override void Say() {
                System.out.println("Гав");
            }
        }
    }