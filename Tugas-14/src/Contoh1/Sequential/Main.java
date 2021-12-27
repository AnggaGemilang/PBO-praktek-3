/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Contoh1.Sequential;

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

        Transaction<Account> acc1 = new Transaction<>(angga, sabihis, 10);
        Transaction<Account> acc2 = new Transaction<>(suwarko, sabihis, 20);
        Transaction<Account> acc3 = new Transaction<>(angga, sabihis, 5);
        Transaction<Account> acc4 = new Transaction<>(sabihis, angga, 30);
        Transaction<Account> acc5 = new Transaction<>(angga, sabihis, 2500);

        angga.printAvailableFunds();
        suwarko.printAvailableFunds();
        sabihis.printAvailableFunds();
        
        System.out.println("Time taken : " + ( System.currentTimeMillis() - startTime ) + " millisecond(s)." );                
        
    }

}
