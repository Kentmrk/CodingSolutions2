package org.example.ZooTask;

public class Elephant extends Mammal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("The elephant eats grass and fruits.");
    }

    @Override
    public void makeSound() {
        System.out.println("Trumpet!");
    }

    @Override
    public void displayInformation() {
        System.out.println("Elephant: Name - " + super.name + ", Age - " + super.age);
    }
}