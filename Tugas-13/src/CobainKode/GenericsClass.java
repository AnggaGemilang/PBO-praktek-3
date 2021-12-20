/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CobainKode;

/**
 *
 * @author angga
 * @param <T>
 */
public class GenericsClass<T> {

    private T t;

    public T get(){
        return this.t;
    }

    public void set(T t1){
        this.t=t1;
    }

    public static void main(String args[]){
        
        GenericsClass<String> typeString = new GenericsClass<>();
        typeString.set("Java");

        System.out.println("typeString : " + typeString.get());        

        GenericsClass<String> typeString2 = new GenericsClass<>();
        typeString2.set("Javascript");

        System.out.println("typeString2 : " + typeString2.get());        
        
        typeString = typeString2;
        System.out.println("typeString : " + typeString.get());
        
        GenericsClass<Integer> typeInteger = new GenericsClass<>();
        typeInteger.set(24);
        System.out.println("typeInteger : " + typeInteger.get());
        
        GenericsClass<Double> typeDouble = new GenericsClass<>();
        typeDouble.set(90.0);
        System.out.println("typeDouble : " + typeDouble.get());  
        
        // typeInteger = typeDouble;        
        
        GenericsClass typeRaw = new GenericsClass();
        typeRaw.set('A');
        typeRaw.set(10);
        typeRaw.set(1.0);
        typeRaw.set("Java Raw");
        System.out.println("typeRaw : " + typeRaw.get());
        
        typeRaw = typeDouble;
        System.out.println("typeRaw : " + typeRaw.get());        
        
    }
    
}