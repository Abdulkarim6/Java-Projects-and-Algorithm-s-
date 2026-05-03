abstract class Animal {
    public abstract String makeSound();
}

class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Woof Woof";
    }
}

class Cat extends Animal {
    @Override
    public String makeSound() {
        return "Meow Meow";
    }
}

class Cow extends Animal {
    @Override
    public String makeSound() {
        return "moo moo";
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        System.out.println("Dog's Sound: " + dog.makeSound());
        System.out.println("Cat's Sound: " + cat.makeSound());
        System.out.println("Cow's Sound: " + cow.makeSound());

    }
}