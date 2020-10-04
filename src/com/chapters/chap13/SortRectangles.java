package com.chapters.chap13;

import com.chapters.chap11.Rectangle;

import java.util.Arrays;

public class SortRectangles {
    public static void main(String[] args) {
        ComparableRectangle[] rectangles = {
                new ComparableRectangle(3.4, 5.4),
                new ComparableRectangle(13.24, 55.4),
                new ComparableRectangle(7.4, 35.4),
                new ComparableRectangle(1.4, 25.4)
        };
        Arrays.sort(rectangles);
        for (Rectangle rectangle: rectangles) {
            System.out.print(rectangle + " ");
            System.out.println();
        }

        House house1 = new House(1, 1750.50);
        House house2 = (House)house1.clone();
        System.out.println(house1 == house2);

    }
}
