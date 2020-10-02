package com.chapters.chap9;

public class TotalArea {
    /** Main method */
    public static void main(String[] args) {
        // Declare circleArray
        Circle[] circleArray;

        // Create circleArray
        circleArray = createCircleArray();

        // Print circleArray and total areas of the circles
        printCircleArray(circleArray);
    }

    /** Create an array of Circle objects */
    public static Circle[] createCircleArray() {
        Circle[] circleArray = new Circle[5];

        for (int i=0; i<circleArray.length; i++)
            circleArray[i] = new Circle(Math.random() * 100);

        // Return Circle array
        return circleArray;
    }

    /** Print an array of circles and their total are */
    public static void printCircleArray(Circle[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (Circle circle : circleArray)
            System.out.printf("%-30f%-15f\n", circle.getRadius(),
                    circle.getArea());

        System.out.println("___________________________________________");

        // Compute and display the result
        System.out.printf("%-30s%-15f\n", "The total area of circles is",
                sum(circleArray));
    }

    /** Add circle areas */
    public static double sum(Circle[] circleArray) {
        // Initialize sum
        double sum = 0;

        // Add areas to sum
        for (Circle circle : circleArray) {
            sum += circle.getArea();
        }
        return sum;
    }
}
