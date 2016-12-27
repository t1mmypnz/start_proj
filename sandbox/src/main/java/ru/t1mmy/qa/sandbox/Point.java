package ru.t1mmy.qa.sandbox;

/**
 * Created by t1mmy on 14.12.2016.
 */
public class Point {
    public double x;
    public double y;

    public Point(double x,double y){
        this.x = x;
        this.y = y;

    }
    public double distance(Point p){
        double f = (p.x - this.x)*(p.x - this.x) + (p.y - this.y)*(p.y - this.y);
        return Math.sqrt(f);
    }
}
