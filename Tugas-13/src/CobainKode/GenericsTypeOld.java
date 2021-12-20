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
public class GenericsTypeOld {
    
    private Object t;

    GenericsTypeOld(Object t){
        this.t = t;
    }
    
    public Object get() {
        return t;
    }
    
    public void set(Object t) {
        this.t = t;
    }

    public static void main(String args[]) {
        GenericsTypeOld type = new GenericsTypeOld((String)
                "Penerapan Generic Programming Dengan Object");
        System.out.println((String) type.get());
    }
    
}
