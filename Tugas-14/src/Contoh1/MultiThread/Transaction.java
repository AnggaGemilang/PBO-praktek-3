/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Contoh1.MultiThread;

/**
 *
 * @author angga
 * @param <T>
 */

public class Transaction<T extends Account> extends Thread {
    
    private final T sourceBankAccount;
    private final T destBankAccount;
    private final int transferAmount;
    private final String threadName;

    Transaction(T source, T destination, int amount, String name) {
        this.sourceBankAccount = source;
        this.destBankAccount = destination;
        this.transferAmount = amount;
        this.threadName = name;
    }

    @Override
    public void run() {
        System.out.println(threadName + ": Transfer " + transferAmount + "$ dari " + sourceBankAccount.getNama() + " ke " + destBankAccount.getNama());
        sourceBankAccount.transferFunds(destBankAccount, transferAmount);
    }
    
}
