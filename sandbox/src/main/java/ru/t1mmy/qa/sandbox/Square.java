package ru.t1mmy.qa.sandbox;

/**
 * Created by t1mmy on 14.12.2016.
 */
public class Square {
    public double l;

    public Square(double l) {
        this.l = l;
    }

    public double area() {
        return this.l * this.l;
    }
}