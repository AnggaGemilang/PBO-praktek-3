/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CobainKode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author angga
 */
public class GenericBoundedUnbounded {
    
    static void displayListItems(List<?> list){
        for (Object listItem : list){
	    System.out.println(listItem);
	}
    }
 
    public static void main(String args[]){

	List<Integer> list1 = new ArrayList<>();
	list1.add(1);
	list1.add(2);
	list1.add(3);	        
        
	List<String> list2 = new ArrayList<>();
	list2.add("Amani");
	list2.add("Pabhjot");
	list2.add("Nidhi");	
 
	System.out.println("List 1");
        displayListItems(list1);
	System.out.println("List 2");
        displayListItems(list2);
    }
    
}
