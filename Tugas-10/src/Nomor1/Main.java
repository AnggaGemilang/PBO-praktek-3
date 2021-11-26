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

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args )  {
        try {
            Thread t = new Thread(new AsyncRun());
            t.start();
            System.out.println("main on thread " + Thread.currentThread().getId());
            throw new NullPointerException();
        } catch(NullPointerException ex){
            System.out.println(ex.getClass().getName() + " handled");
        }
    }
    
}
