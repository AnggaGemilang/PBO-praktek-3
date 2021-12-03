/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Versi2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author angga
 */
public abstract class Flight {
    
    private final String id;
    List<Passenger> passengers = new ArrayList<>();
    
    public Flight(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }
    
    public List<Passenger> getPassengersList() {
        return Collections.unmodifiableList(passengers);
    }
    
    public abstract boolean addPassenger(Passenger passenger);
    
    public abstract boolean removePassenger(Passenger passenger);
}
