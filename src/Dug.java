package src;

public class Dug extends Animal {

    public Dug(String name, int age, double weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    public void say() {
        System.out.println("Кря");
    }

    @Override
    public void fly() {
        System.out.println("Я лечу");
    }
}
}
