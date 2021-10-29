/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor1;

/**
 *
 * @author angga
 */
public class Circle {
    
    private double radius;
    private String color;
    
    public Circle() {
        radius = 1.0;
        color = "red";
    }
    
    public Circle(double r) {
        this.radius = r;
        this.color = "red";
    }
     
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + " color=" + getColor() + "]";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
