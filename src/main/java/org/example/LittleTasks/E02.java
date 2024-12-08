package org.example.LittleTasks;

public class E02 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello123! World, Java@2024");

        int alphaCount = 0;

        // Loop through each character in the StringBuilder
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                alphaCount++;
            }
        }

        System.out.println("The number of alphabetic characters is: " + alphaCount);
    }
}