/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Versi1;

/**
 *
 * @author angga
 */
public class Passenger {
    
    private final String name;
    private final boolean vip;
	
    public Passenger(String name, boolean vip) {
	this.name = name;
    	this.vip = vip;
    }
	
    public String getName() {
	return name;
    }
	
    public boolean isVip() {
    	return vip;
    }

}