package src;

public abstract class Animal ( ){

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
                 String yearWord;
                 if (age % 10 == 1 && age % 100 != 11) {
                     yearWord = "год";
                 } else if (age % 10 >= 2 && age % 10 <= 4 && (age % 100 < 10 || age % 100 >= 20)) {
                     yearWord = "года";
                 } else {
                     yearWord = "лет";
                 }
                 return System.out.println("Привет! Меня зовут " + name + ", мне " + age + " " + yearWord + ", я вешу - " + weight + " кг, мой цвет - " + color);
             }

    public void fly() {
        interface Flying {
            void fly();
        }
    }
}


