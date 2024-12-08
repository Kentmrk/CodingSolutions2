package org.example.LittleTasks;
import java.util.ArrayList;
import java.util.HashSet;
//I`ll do it with additional list
public class E10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");

        // Call the method to remove duplicates
        ArrayList<String> uniqueList = removeDuplicates(list);

        System.out.println("List after removing duplicates: " + uniqueList);
    }

    // Method to remove duplicates using HashSet
    public static ArrayList<String> removeDuplicates(ArrayList<String> list) {
        // Convert ArrayList to HashSet to remove duplicates
        HashSet<String> set = new HashSet<>(list);

        // Convert the HashSet back to ArrayList
        return new ArrayList<>(set);
    }
}