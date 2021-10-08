/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor_3;

/**
 *
 * @author angga
 */
public class ContohStaticBlock {
    
   static double PHI;
   static String NAMA_AKU;
   
   static{
      PHI = 3.14;
      NAMA_AKU = "Angga Gemilang";
   }
   
   public static void main(String args[])
   {
      System.out.println("Nilai phi adalah : " + PHI);
      System.out.println("Halo, Namaku : " + NAMA_AKU);
   }
}
