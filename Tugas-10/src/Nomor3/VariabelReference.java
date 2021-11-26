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

public class VariabelReference {
    
    String str;
    String str2 = "Ini String";
    
    public static void main(String[] args){
        
        String str3;
        
        VariabelReference vr = new VariabelReference();
        
        System.out.println("str : " + vr.str);
        System.out.println("str2 : " + vr.str2);
//        System.out.println(str3);
        
    }
    
}
