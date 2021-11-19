/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;

/**
 *
 * @author angga
 */
public class DirtyBubble extends SuperHero {

    public DirtyBubble(int powerLevel, String name) {
	super(powerLevel, name);
	super.addPower(new Strength());
	super.addPower(new Flying());
    }

    @Override
    public void identity() {
	System.out.printf("It's %s, the DirtyBubble! It has the power level of %d\n", this.getName(), this.getPowerLevel());
        super.identity();
    }

}
