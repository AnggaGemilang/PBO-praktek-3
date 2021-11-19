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
abstract public class Shape {
    
    private String shapeName;
    
    public Shape(String shapeName){
        this.shapeName = shapeName;
    }
    
    public abstract double area();
    
    @Override
    public String toString(){
        return getShapeName();
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
}
