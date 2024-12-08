package org.example.LittleTasks;

public class E01 {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Hello");
        StringBuilder str2 = new StringBuilder("World");

        System.out.println("Before Swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // Swapping without a temporary variable same like numbers
        str1.append(str2); // Append str2 to str1
        str2.replace(0, str2.length(), str1.substring(0, str1.length() - str2.length())); // Replace str2 with original str1
        str1.delete(0, str1.length() - str2.length()); // Remove original str1 from str1 to leave original str2

        System.out.println("\nAfter Swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}