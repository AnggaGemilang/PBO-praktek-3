/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoh2.MultiThread;

/**
 *
 * @author angga
 */
public class Main {
    
    public static void main(String[] args) {
        
        Thread t1 = new Thread(new InfiniteLoop());
        Thread t2 = new Thread(new InfiniteLoop1());
        t1.start();
        t1.setPriority(1);
        t2.start();
        t1.setPriority(2);
        
        try {
            t1.join(1000);
            t2.join(1000);
        } catch(InterruptedException ex){}
    }
    
}
