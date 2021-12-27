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

public interface BankAccount<T> {
    public void transferFunds(final T destination, Integer amount);
    public void printAvailableFunds();
}
