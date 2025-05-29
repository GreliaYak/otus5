package src.actions;
public class Actions {
public static void main(String[] args) {
    Actions actions = new Actions();
    actions.say();
    actions.go();
    actions.drink();
    actions.eat();
}

// Методы public
void say() {
String say = "Я говорю";
        System.out.println(say);
    }

public void go() {
    System.out.println("Я иду");
}

public void drink() {
    System.out.println("Я пью");
}

public void eat() {
    System.out.println("Я ем");
}
}