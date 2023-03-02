package animal;

import animal.animals.Animal;
import animal.animals.Cat;
import animal.animals.Dog;
import animal.animals.Puppy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Animal animal = new Animal();
        animal.eat();

        System.out.println();
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        System.out.println();
        Puppy puppy = new Puppy();
        puppy.weep();
        puppy.bark();
        puppy.eat();

        System.out.println();
        Cat cat = new Cat();
        cat.meow();
        cat.eat();

        System.out.println();
        Cow cow = new Cow();
        cow.moo();
        cow.eat();

    }
}