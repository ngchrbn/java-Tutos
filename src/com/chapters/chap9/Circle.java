package com.chapters.chap9;

public class Circle {
    /** The radius of the circle */
    private double radius = 1;

    /** The number of Objects created */
    private static int numberOfObjects = 0;

    /** Construct a circle with radius */
    public Circle() {
        numberOfObjects++;
    }

    /** Construct a circle with a specified radius */
    public Circle(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }


    /** Return numberOfObjects */
    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /** Return the area of this circle */
    double getArea() {
        return radius * radius * Math.PI;
    }
}
