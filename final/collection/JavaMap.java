package me.sit.dev.collections;

import java.util.ArrayList;
import java.util.List;

public class JavaList {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(5);

        System.out.println("Arrays l1 before add: " + l1);

        List<Integer> l2 = new ArrayList<Integer>();
        // Again adding elements to object of List interface
        // Custom inputs
        l2.add(1);
        l2.add(2);
        l2.add(3);

        l1.addAll(l2);

        System.out.println("Arrays l1 after add: " + l1);

        // Removes element from index 1
        l1.remove(1);
        System.out.println("Arrays l1 after removed at index 1: " + l1);

        List<String> l3 = new ArrayList<>();
        l3.add("Hello");
        l3.add("World");
        l3.add("Java");
        System.out.println("Arrays l3 before removed by value: " + l3);

        // Get element by index
        String element = l3.get(0);
        System.out.println("Element at index 0: " + element);

        // Remove element by value
        l3.remove("Hello");
        System.out.println("Arrays l3 after removed by value: " + l3);

        // Check if list contains element
        boolean isContains = l3.contains("Hello");
        System.out.println("Is l3 contains World: " + isContains);

        // Get size of list
        int size = l3.size();
        System.out.println("Size of l3: " + size);

        // Clear all elements
        l3.clear();
        System.out.println("Arrays l3 after clear: " + l3);

        // Check if list is empty
        boolean isEmpty = l3.isEmpty();
        System.out.println("Is l3 empty: " + isEmpty);

        List<String> l4 = new ArrayList<>();
        l4.add("Hello");
        l4.add("World");
        l4.add("Java");
        l4.add("Java555");
        l4.add("Javasfs");
        // Get index of element
        int index = l4.indexOf("Java");
        System.out.println("Index of Java: " + index);

        /*
          Print all element in arrays that
           it's index is even
         */
        for(String s : l4) {
            int i = l4.indexOf(s);
        }
    }
}
