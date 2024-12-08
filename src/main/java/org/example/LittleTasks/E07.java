package org.example.LittleTasks;

public class E07 {
    public static void main(String[] args) {
        String input = "Hello, world!";

        // Call the function to count words
        int wordCount = countWords(input);

        System.out.println("The number of words in \"" + input + "\" is: " + wordCount);
    }

    // Function to count words in a string
    public static int countWords(String str) {
        // Use regex to split the string by spaces and punctuation
        String[] words = str.split("[\\s\\p{Punct}]+");

        // Filter out empty strings
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        return count;
    }
}