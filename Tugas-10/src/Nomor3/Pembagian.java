/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor3;
/**
 *
 * @author angga
 */
public class Pembagian {
 
    public static void main(String[] args) {
    
        try {
            System.out.println("Hasil Dari 10/0 : " + 10/0);
        } catch(ArithmeticException e){
            System.out.println("Tidak boleh membagi angka dengan 0");
        }
        
    }
    
}
