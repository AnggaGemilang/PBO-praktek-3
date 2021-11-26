/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author angga
 */
public class TexfieldInteger {

    public static void main(String[] args){
        
        try  {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan Umur Anda : ");
            sc.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Nilai tidak valid");
        }
        
    }
    
}
