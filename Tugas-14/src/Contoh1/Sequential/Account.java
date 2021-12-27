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

public class Account implements BankAccount<Account> {
    
    private final Integer id;
    private final String nama;
    private Integer availableFunds;

    public Account(Integer accountId, String nama, Integer accountAmount) {
        this.id = accountId;
        this.nama = nama;
        this.availableFunds = accountAmount;
    }

    public int getAvailableFunds() {
        return this.availableFunds;
    }
    
    private void withdraw(Integer amount) {
        availableFunds -= amount;
    }

    private void deposit(Integer amount) {
        availableFunds += amount;
    }

    public String getNama() {
        return nama;
    }
    
    public Integer getId() {
        return id;
    }    
    
    @Override
    public void printAvailableFunds() {
        System.out.println("Saldo " + nama + ": " + availableFunds + "$");
    }

    @Override
    public void transferFunds(final Account destination, Integer amount) {
        this.withdraw(amount);
        destination.deposit(amount);
    }
    
}
