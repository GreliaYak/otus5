package src;

public class Dug extends Animal {

    public Dug(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    public void Say() {
        System.out.println("Кря");
    }

    @Override
    public void fly() {
        System.out.println("Я лечу");
    }
}
}
