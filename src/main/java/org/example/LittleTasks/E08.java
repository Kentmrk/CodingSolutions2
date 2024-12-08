package org.example.LittleTasks;
import java.util.ArrayList;
import java.util.List;

public class E08 {
    public static void main(String[] args) {
        List<String> inputList = List.of("Apple", "Banana", "Avocado", "apricot", "Berry", "Almond");

        // Call the method to filter and convert to lowercase
        List<String> resultList = filterAndConvert(inputList);

        System.out.println("Filtered and lowercased strings: " + resultList);
    }

    // Method to filter strings starting with "A" and convert them to lowercase
    public static List<String> filterAndConvert(List<String> strings) {
        List<String> result = new ArrayList<>();

        for (String str : strings) {
            if (str.toLowerCase().startsWith("a")) { // Check if it starts with "A" (case-insensitive)
                result.add(str.toLowerCase()); // Convert to lowercase and add to result
            }
        }

        return result;
    }
}