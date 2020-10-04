package com.chapters.chap13;

import java.util.Date;

public class House implements Cloneable, Comparable<House> {
    private int id;
    private double area;
    private Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new Date();
    }

    public int getId() {
        return id;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    /** Override the protected clone method defined in
     * the Object class, and strengthen its accessibility */
    @Override
    public Object clone() {
        try {
            // Perform a shallow copy
            House houseClone = (House)super.clone();
            // Deep copy on whenBuilt
            houseClone.whenBuilt = (Date)(whenBuilt.clone());
            return houseClone;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    /** Implement the compareTo method defined in Comparable */
    @Override
    public int compareTo(House o) {
        if (area > o.area)
            return 1;
        else if (area < o.area)
            return -1;
        return 0;
    }
}
