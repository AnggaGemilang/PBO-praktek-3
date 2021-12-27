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

public class Account implements BankAccount<Account> {
    
    private final Integer id;
    private final String nama;
    private Integer availableFunds;

    public Account(Integer accountId, String nama, Integer accountAmount) {
        this.id = accountId;
        this.nama = nama;
        this.availableFunds = accountAmount;
    }

    public Integer getAvailableFunds() {
        return this.availableFunds;
    }
    
    private void withdraw(Integer amount) {
        availableFunds -= amount;
    }

    private void deposit(Integer amount) {
        availableFunds += amount;
    }

    private Integer compareAccountIds(Account destination) {
        return this.id.compareTo(destination.id);
    }

    public Integer getId() {
        return id;
    }    
    
    public String getNama() {
        return nama;
    }
    
    @Override
    public void printAvailableFunds() {
        System.out.println("Saldo " + nama + ": " + availableFunds + "$");
    }

    @Override
    public void transferFunds(final Account destination, Integer amount) {
        Account sourceLock;
        Account destLock;
        Integer result = compareAccountIds(destination);
        if (result > 0) {
            sourceLock = destination;
            destLock = this;
        } else {
            sourceLock = this;
            destLock = destination;
        }
        synchronized (sourceLock) {
            if (this.availableFunds <= amount) {
                throw new IllegalArgumentException(this.id + " Saldo Tidak Cukup");
            }
            this.withdraw(amount);
            synchronized (destLock) {
                destination.deposit(amount);
            }
        }
    }
    
}
