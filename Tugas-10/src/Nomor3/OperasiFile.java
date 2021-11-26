/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author angga
 */
public class OperasiFile {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("sabihis.txt"); 
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
