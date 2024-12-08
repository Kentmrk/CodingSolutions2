package org.example.LittleTasks;

public class E09 {
    public static void main(String[] args) {
        String input = "abracadabra";

        // Call the method to find the first non-repeating character
        char result = firstNonRepeatingCharacter(input);

        if (result != 0) {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating characters found.");
        }
    }

    // Method to find the first non-repeating character
    public static char firstNonRepeatingCharacter(String str) {
        // Convert string to StringBuilder to iterate over characters
        StringBuilder strBuilder = new StringBuilder(str);

        // Loop through each character in the string
        for (int i = 0; i < strBuilder.length(); i++) {
            char currentChar = strBuilder.charAt(i);

            // Check if the current character appears only once in the string
            if (strBuilder.indexOf(String.valueOf(currentChar)) == strBuilder.lastIndexOf(String.valueOf(currentChar))) {
                return currentChar; // Return the first non-repeating character
            }
        }

        return 0; // Return 0 if no non-repeating character is found
    }
}