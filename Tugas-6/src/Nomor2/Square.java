/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;

/**
 *
 * @author Angga
 */
public class Square extends Rectangle {
    public Square() {
        super();
    }
    
    public Square(double side) {
        super(side,side);
    }
    
    public Square (double side, String color, boolean filled) {
        super(side,side,color,filled);
    }
    
    public double getArea() {
        return super.getArea();
    }
    
    public double getPerimeter() {
        return super.getPerimeter();
    }
    
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    
    public double getSide() {
        return super.getLength();
    }
    
    public void setWidth(double side) {
        setSide(side);
    }
    
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    
    public String toString() {
        return "A Square with side = " +getSide()+ " which is a subclass of "+
                super.toString();
    }
    
}
