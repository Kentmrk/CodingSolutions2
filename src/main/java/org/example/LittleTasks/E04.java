package org.example.LittleTasks;

public class E04 {
    public static void main(String[] args) {
        String input = "madam";

        // Create a StringBuilder with the input string
        StringBuilder strBuilder = new StringBuilder(input);

        // Reverse the string
        String reversed = strBuilder.reverse().toString();

        // Check if the original string is equal to the reversed string
        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }
    }
}