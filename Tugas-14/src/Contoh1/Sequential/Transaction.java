/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Contoh1.Sequential;

/**
 *
 * @author angga
 * @param <T>
 */

public class Transaction<T extends Account> {
    
    private final T sourceBankAccount;
    private final T destBankAccount;
    private final int transferAmount;

    Transaction(T source, T destination, int amount) {
        this.sourceBankAccount = source;
        this.destBankAccount = destination;
        this.transferAmount = amount;
        
        System.out.println("Transfer " + transferAmount + "$ dari " + sourceBankAccount.getNama() + " ke " + destBankAccount.getNama());
        sourceBankAccount.transferFunds(destBankAccount, transferAmount);
    }
    
}
