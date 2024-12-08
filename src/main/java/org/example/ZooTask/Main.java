package org.example.ZooTask;

public class Main {
    public static void main(String[] args) {
        // Creating animal objects
        Lion lion = new Lion("Leo", 5);
        Elephant elephant = new Elephant("Dumbo", 10);
        Parrot parrot = new Parrot("Polly", 2);
        Eagle eagle = new Eagle("Sky", 4);

        // Calling methods for animal behavior
        lion.eat();
        lion.makeSound();
        lion.displayInformation();

        elephant.eat();
        elephant.makeSound();
        elephant.displayInformation();

        parrot.eat();
        parrot.makeSound();
        parrot.displayInformation();

        eagle.eat();
        eagle.makeSound();
        eagle.displayInformation();

        // Creating a registration object
        Registration reg = new Registration();

        // Setting user information with validation
        reg.setEmail("user@yahoo.com");
        reg.setUserName("johnDoe");
        reg.setPassword("password123");

        // Displaying user information
        reg.displayUserInfo();
    }
}
