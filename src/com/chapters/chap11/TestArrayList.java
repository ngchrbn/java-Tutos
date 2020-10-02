package com.chapters.chap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestArrayList {
    public static void main(String[] args) {
        // Create a list to store cities
        ArrayList<String> cityList = new ArrayList<>();

        // Add some cities in the list
        cityList.add("Gihosha");
        cityList.add("Mutanga");
        cityList.add("Buyenzi");
        cityList.add("Rohero");
        cityList.add("Ngagara");
        cityList.add("Kinindo");

        System.out.println("List size? " + cityList.size());
        System.out.println("Is Buyenzi in the list? " +
                cityList.contains("Buyenzi"));
        System.out.println("The location of Gihosha in the list? " +
                cityList.indexOf("Gihosha"));
        System.out.println("Is the list empty? " +
                cityList.isEmpty());

        // Insert a new city at index 2
        cityList.add(2, "Musaga");

        // Remove a city from the list
        cityList.remove("Kinindo");

        // Remove city at index 1
        cityList.remove(1);

        // Display the contents in the list
        System.out.println(cityList.toString());

        // Display the contents in the list in reverse order
        for (int i=cityList.size()-1; i>=0; i--)
            System.out.println(cityList.get(i));
        System.out.println();

        // Create a list to store two circles
        ArrayList<Circle> list = new ArrayList<>();

        // Add two circles
        list.add(new Circle(2));
        list.add(new Circle(3));

        // Display the area of the first circle in the list
        System.out.println("The area of the circle? " +
                list.get(0).getArea());

        Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(array));

        System.out.print(Collections.max(list2));
    }
}
