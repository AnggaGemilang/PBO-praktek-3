/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CobainKode;

/**
 *
 * @author angga
 */
public class GenericsMethods {

    //Java Generic Method
    public static <T> boolean isEqual(GenericsClass<T> g1, GenericsClass<T> g2){
        return g1.get().equals(g2.get());
    }

    public static void main(String args[]){
        GenericsClass<Integer> g1 = new GenericsClass<>();
        g1.set(1);

        GenericsClass<Integer> g2 = new GenericsClass<>();
        g2.set(3);
//        boolean isEqual = GenericsMethods.<Integer>isEqual(g1, g2);

        //above statement can be written simply as
        boolean isEqual = GenericsMethods.isEqual(g1, g2);

        /*This feature, known as type inference, allows you to invoke
        a generic method as an ordinary method, without specifying a type
        between angle brackets */
        //Compiler will infer the type that is needed
        
        System.out.println(isEqual);
    }
    
}
