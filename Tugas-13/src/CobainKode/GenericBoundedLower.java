/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CobainKode;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author angga
 */
public class GenericBoundedLower {
    
    public static double sum(List<? super Integer> numberlist) {
        double sum = 0.0;
        for (Object n : numberlist) sum += Double.parseDouble(n.toString());
        return sum;
   }

   public static void main(String args[]) {
      List<Number> integerList = Arrays.asList(1, 2, 3);
      System.out.println("sum = " + sum(integerList));

      List<Number> doubleList = Arrays.asList(1.2, 2.3, 3.5);
      System.out.println("sum = " + sum(doubleList));
   }
    
}
