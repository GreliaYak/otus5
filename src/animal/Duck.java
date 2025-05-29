package src.animal;
import src.Animal;
import src.actions.Fly;

public class Duck extends Animal implements Fly {
    public Duck(String name, int age, double weight, String color) {
        super(name, age, weight, color);
    }

    @Override public void Say() {
        System.out.println("Кря");
    }

    @Override public boolean isFlying() {
        return false;
    }

    @Override
    public void Fly() {
        System.out.println("Я лечу");
    }
}