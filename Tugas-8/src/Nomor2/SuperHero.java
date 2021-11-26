/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;

import java.util.ArrayList;
import java.util.List;

/**
 *  
 * @author angga
 */
public abstract class SuperHero implements Comparable<SuperHero> {
    
    private final Integer powerLevel;
    private final String name;
    private final List<Power> powerList;

    {
	this.powerList = new ArrayList<>();        
    }
    
    public SuperHero(Integer powerLevel, String name){
    	this.powerLevel = powerLevel;
	this.name = name;
    }

    public int getPowerLevel(){
    	return powerLevel;
    }

    public String getName(){
	return name;
    }
	
    public void addPower(Power power){
	powerList.add(power);
    }
	
    public void identity(){
        System.out.println("“Siap ! saya " + this.name + " siap menjadi pahlawan dengan kekuatan");
        showPowers();
    }
	
    public void showPowers() {
        powerList.forEach(power -> {
            power.doPower();
        });
    };

    @Override
    public int compareTo(SuperHero superHero) {    
        return this.powerLevel.compareTo(superHero.powerLevel);
    }
    
}