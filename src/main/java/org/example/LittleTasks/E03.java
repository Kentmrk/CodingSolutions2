package org.example.LittleTasks;

public class E03 {
    public static void main(String[] args) {
        String input = "olleH";

        // Create a StringBuilder with the input string
        StringBuilder strBuilder = new StringBuilder(input);

        // Reversing
        String reversed = strBuilder.reverse().toString();

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}