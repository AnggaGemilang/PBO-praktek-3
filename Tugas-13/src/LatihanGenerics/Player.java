/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LatihanGenerics;

/**
 *
 * @author angga
 * @param <T>
 */

// Generic Class

public abstract class Player<T> {
    
    private final String name;

    public <T> Player(String name) {
        this.name = name;
    }

    public <T> String getName() {
        return this.name;
    }

}
