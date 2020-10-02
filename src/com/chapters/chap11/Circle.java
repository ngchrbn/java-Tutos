package com.chapters.chap11;

public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }
    /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + super.getDateCreated() +
                " and the radius is " + radius);
    }

    /** Override the toString method defined in the superclass */
    @Override
    public String toString() {
        return super.toString() + "\nThe radius is " + radius;
    }

    /** Override the equals method defined in the Object class */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle)
            return radius == ((Circle)o).radius;
        else
            return false;
    }
}