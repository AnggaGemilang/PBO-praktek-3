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
public class InfiniteLoop1 implements Runnable {
    
    @Override
    public void run(){
       while (true) {
           try {
                System.out.println("In run method " + Thread.currentThread().getName() + " hiyaaa");
                Thread.sleep(1000);
           } catch (InterruptedException ex){
                Thread.currentThread().interrupt();
           }
       } 
    }
    
}
