package org.example.ZooTask17;

public class Lion extends Mammal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("The lion hunts for meat.");
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }

    @Override
    public void displayInformation() {
        System.out.println("Lion: Name - " + super.name + ", Age - " + super.age);
    }
}