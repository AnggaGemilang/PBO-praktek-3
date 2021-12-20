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
interface MinMaxOperation<T> {
    T max(); /* w w w .java2 s . co m*/
}

class MyClass<T extends Comparable<T>> implements MinMaxOperation<T> {
    T[] vals;
    
    MyClass(T[] o) {
        vals = o;
    }

    @Override
    public T max() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }
        return v;
    }
}

public class GenericInterface {

    public static void main(String args[]) {
        Integer inums[] = { 3, 6, 2, 8, 6 };
        Character chs[] = { 'b', 'r', 'p', 'w' };
        MyClass<Integer> a = new MyClass<>(inums);
        MyClass<Character> b = new MyClass<>(chs);
        System.out.println(a.max());
        System.out.println(b.max());
    }

}
