/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author angga
 */
public class AvengedSimulator {
    
    public static void main(String[] args) {
        List<SuperHero> superHero = new ArrayList<>();
        superHero.add(new ManRay(553, "Gyoubu Masataka Oniwa"));
        superHero.add(new ManRay(0, "Gennichiro"));
        superHero.add(new FlyingDutchMan(255, "Shirai"));
        superHero.add(new FlyingDutchMan(36556, "Tatenari"));
        superHero.add(new DirtyBubble(666, "Arnastria"));
		 
        Collections.sort(superHero);
            
        for (var hero : superHero) {
            System.out.println("===============================");
            hero.identity();
            hero.showPowers();
            System.out.println("===============================");
        }
    }
}
