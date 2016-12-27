package ru.t1mmy.qa.sandbox;

/**
 * Created by t1mmy on 14.12.2016.
 */
public class Rectangle {
    public double a, b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double area() {
        return this.a*this.b;
    }
}
