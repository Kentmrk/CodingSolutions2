package org.example.ZooTask;

public abstract class Animal implements AnimalBehavior {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public abstract void eat();
    public abstract void makeSound();

    public abstract void displayInformation();
}
