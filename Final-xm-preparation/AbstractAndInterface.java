abstract class AnimalSleep {
    int age; // instance variable
    String name;

    AnimalSleep(int ageIn, String nameIn) { // initialized variable with constructor
        age = ageIn; // constructor name must be same of class name
        name = nameIn;
    }

    abstract void eat(); // abstract class must need an abstract method

    void sleep() { // concrete a method
        System.out.println("name: " + name + " ." + "age: " + age);
        System.out.println("The animal Sleeps.");
    }
}

interface AnimalSound {
    void sound(); // mainly work of interface is declare methodes without body

    default void feature() { // interface support method including body with "default" keyword after java
                             // version 8;
        System.out.println("The animal has two Eye");
    }
}

class Dog extends AnimalSleep implements AnimalSound {
    Dog(int age, String name) { // super() calls the constructor[AnimalSleep] of the parent class...
        super(age, name); // to initialized the values
    }

    void eat() { // abstract method of abstract class, must be implementation in inherited class
        System.out.println("Dog eats Beef");
    }

    void guardHouse() {
        System.out.println("Dogs guards the house.");
    }

    public void sound() { // methods of interface class, implementation with "public" keyword;
        System.out.println("Dog says: Woof Woof");
    }
}

class Cow extends AnimalSleep implements AnimalSound {
    Cow(int age, String name) {
        super(age, name);
    }

    void giveMilk() {
        System.out.println("Cow gives milk.");
    }

    void eat() {
        System.out.println("Cow eats Forage");
    }

    public void sound() {
        System.out.println("Cow says: Moo Moo");
    }
}

public class AbstractAndInterface {
    public static void main(String[] args) {
        Dog d = new Dog(1, "BlackDog");
        Cow c = new Cow(5, "MamunCow");

        System.out.println("------Dog--------");
        d.sleep();
        d.eat();
        d.feature();
        d.sound();
        d.guardHouse();

        System.out.println("------Cow--------");
        c.sleep();
        c.eat();
        c.feature();
        c.sound();
        c.giveMilk();
    }
}
