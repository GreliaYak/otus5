package src.animal;

public abstract class Animal {
    private String name;
    private int age;
    private double weight;
    private String color;

    // Конструктор
    public Animal(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Методы поведения
    public void say() {
        System.out.println("Я говорю");
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

    // Переопределение метода toString
    @Override
    public String toString() {
        String ageWord;
        int ageLastDigit = age % 10;
        int ageLastTwoDigits = age % 100;

        if (ageLastTwoDigits >= 11 && ageLastTwoDigits <= 14) {
            ageWord = "лет";
        } else {
            switch (ageLastDigit) {
                case 1:
                    ageWord = "год";
                    break;
                case 2:
                case 3:
                case 4:
                    ageWord = "года";
                    break;
                default:
                    ageWord = "лет";
            }
        }

        return String.format("Привет! Меня зовут %s, мне %d %s, я вешу - %.1f кг, мой цвет - %s",
                name, age, ageWord, weight, color);
    }
}

