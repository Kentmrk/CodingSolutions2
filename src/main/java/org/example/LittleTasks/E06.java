package org.example.LittleTasks;

public class E06 {
    public static void main(String[] args) {
        String input = "documentation";

        // Call the method to count vowels
        int vowelCount = countVowels(input);

        System.out.println("The number of vowels in \"" + input + "\" is: " + vowelCount);
    }

    // Method to count vowels
    public static int countVowels(String str) {
        int count = 0;

        // Convert the string to lowercase to handle case insensitivity
        str = str.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // Check if the character is a vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }
}