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
class Bound <T extends A> {
    private T objRef;
    
    public Bound(T obj){
        this.objRef = obj;
    }
    
    public void doRunTest(){
        this.objRef.displayClass();
    }
}

class A {
    public void displayClass(){
        System.out.println("Inside super class A");
    }
}

class B extends A{
    public void displayClass(){
        System.out.println("Inside sub class B");
    }
}

class C extends A{
    public void displayClass(){
        System.out.println("Inside sub class C");
    }
    
    public static String print(String data){
        return data;
    }
    
}

public class GenericBounded{
    public static void main(String a[]){
        // Creating object of sub class C and
        // passing it to Bound as a type parameter.
        Bound<C> bec = new Bound<>(new C());
        bec.doRunTest();

        // Creating object of sub class B and
        // passing it to Bound as a type parameter.
        Bound<B> beb = new Bound<>(new B());
        beb.doRunTest();

        // similarly passing super class A
        Bound<A> bea = new Bound<>(new A());
        bea.doRunTest();
    }
}