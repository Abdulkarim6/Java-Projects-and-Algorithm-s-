class Animal {
    void sleep() {
        System.out.println("The animal sleeps.");
    }

    void eat() {
        System.out.println("The animal eats food.");
    }

    void sound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    void guardHouse() {
        System.out.println("Dogs guards the house.");
    }

    @Override
    void sound() {
        System.out.println("Dog says: woof woof");
    }
}

class Cow extends Animal {
    void giveMilk() {
        System.out.println("Cow gives milk.");
    }

    @Override
    void sound() {
        System.out.println("Cow says: Moo Moo!");
    }
}

public class InheritanceWithAnimal {
    public static void main() {
        Dog d = new Dog();
        Cow c = new Cow();

        System.out.println("--- Dog ---");
        d.eat(); // inherited
        d.sleep(); // inherited
        d.guardHouse(); // own method
        d.sound(); // overridden

        System.out.println("--- Cow ---");
        c.eat(); // inherited
        c.sleep(); // inherited
        c.giveMilk(); // own method
        c.sound(); // overridden
    }
}
