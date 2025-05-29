package src;

public class Animal {

    public static void Animal(String[] args) {

    }

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

    String name;
    int age;
    double weight;
    String color;

    public Animal (String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    @Override public String toString() {
        String ageUnit;
        if (age % 10 == 1 && age != 11) {
            ageUnit = "год";
        } else if ((age % 10 >= 2 && age % 10 <= 4) && !(age >= 12 && age <= 14)) {
            ageUnit = "года";
        } else {
            ageUnit = "лет";
        }
        return ("Привет! Меня зовут " + name + ", мне " + age + " " + ageUnit + ", я вешу - " + weight + " кг, мой цвет - " + color);
    }
}

