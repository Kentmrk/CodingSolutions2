package org.example.ZooTask;

public class Eagle extends Bird {
    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("The eagle hunts for small animals.");
    }

    @Override
    public void makeSound() {
        System.out.println("Screech!");
    }

    @Override
    public void displayInformation() {
        System.out.println("Eagle: Name - " + super.name + ", Age - " + super.age);
    }
}