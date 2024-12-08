package org.example.ZooTask17;

public class Parrot extends Bird {
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("The parrot eats seeds and fruits.");
    }

    @Override
    public void makeSound() {
        System.out.println("Squawk!");
    }

    @Override
    public void displayInformation() {
        System.out.println("Parrot: Name - " + super.name + ", Age - " + super.age);
    }
}
