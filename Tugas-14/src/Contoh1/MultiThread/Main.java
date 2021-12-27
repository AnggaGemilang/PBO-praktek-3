/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Contoh1.MultiThread;

/**
 *
 * @author angga
 */

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        
        Account angga = new Account(201511036, "Angga", 3000);
        Account sabihis = new Account(192011052, "Sabihis", 10);
        Account suwarko = new Account(182020112, "Suwarko", 2000);
        
        Transaction<Account> t1 = new Transaction<>(angga, sabihis, 10, "Thread-1");
        Transaction<Account> t2 = new Transaction<>(suwarko, sabihis, 20, "Thread-2");
        Transaction<Account> t3 = new Transaction<>(angga, sabihis, 5, "Thread-3");
        Transaction<Account> t4 = new Transaction<>(sabihis, angga, 30, "Thread-4");
        Transaction<Account> t5 = new Transaction<>(angga, sabihis, 2500, "Thread-5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();        
        
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch(InterruptedException e){}

        System.out.println("All threads are done");

        angga.printAvailableFunds();
        suwarko.printAvailableFunds();
        sabihis.printAvailableFunds();
        
        System.out.println("Time taken : " + ( System.currentTimeMillis() - startTime ) + " millisecond(s)." );        
        
    }

}
