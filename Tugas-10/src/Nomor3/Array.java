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
public class Array {
    
    public static void main(String[] args){
        
        int arr[] = {1, 2, 3}; 
        try {
            for(int i = 0; i < 5; i++){
                System.out.println(arr[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        
    }    
    
}
