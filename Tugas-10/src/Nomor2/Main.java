/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;

/**
 *
 * @author angga
 */
public class Main {
    
    public static void checkHexadecimal(String tulisan) throws HexadecimalException {
        if (!tulisan.matches("-?[0-9a-fA-F]{4}+")) {
           throw new HexadecimalException();
        }
    }
    
    public static void main(String[] args){
        try {
            checkHexadecimal("9ABC1");
        } catch (HexadecimalException ex){
            System.out.println(ex.getMessage());
        }
        
    }
}
