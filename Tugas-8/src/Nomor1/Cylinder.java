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
public class Cylinder extends Shape {
    
    private final double radius;
    private final double height;
    
    public Cylinder(double radius, double height) {
        super("shapeName");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return Math.PI*(radius*radius)*height;
    }
    
    @Override
    public String toString(){
	return super.toString() + " of radius " 
                + radius + " and height " + height;
    }
    
}
