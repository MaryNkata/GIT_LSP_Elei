package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import org.howard.edu.lsp.assignment4.IntegerSet.IntegerSetException;

public class Driver {
	 public static void main(String[] args) throws IntegerSetException {
        IntegerSet seta = new IntegerSet();
        IntegerSet setb = new IntegerSet();
        IntegerSet setc = new IntegerSet();
        IntegerSet setd = new IntegerSet();
        
        //testing add function 
        seta.add(1);
        seta.add(2);
        seta.add(3);
        seta.add(4);
        seta.add(5);
        seta.add(0);
        
        setc.add(1);
        setc.add(2);
        setc.add(3);
        setc.add(4);
        setc.add(5);
        setc.add(0);
        
        //trying to remove from an empty set --> should be no error
        setd.remove(5);
        
        //Testing equality
        System.out.println("SetA and SetC  are equal: " + seta.equals(setc));
        
        //testing toString and length function 
        System.out.println("Values of Set A are: " + seta.toString());
        System.out.println("Length of set A is: " + seta.length());
        
        //testing remove function 
        seta.remove(3);
        System.out.println("After removing a value, the values of Set A are: " + seta.toString());
        System.out.println("Length of set A is now: " + seta.length());
        
        //adding to set b to test the other functions and double testing add function  
        setb.add(3);
        setb.add(4);
        setb.add(2);
        setb.add(30);
        setb.add(-21);
        //testing equals function to string and largest function 
        System.out.println("SetA and Set B are equal: " + seta.equals(setb));
        System.out.println("Values of Set A are: " + seta.toString());
        System.out.println("Values of Set B are: " + setb.toString());
        System.out.println("The largest value in set A is: " + seta.largest());
        
        //testing remove function to test the largest and smallest function 
        seta.remove(0);
        System.out.println("The largest value in Set A is: " + seta.largest());
        System.out.println("The smallest value in Set A is: " + seta.smallest());
        
        seta.remove(2);
        System.out.println("The smallest value in Set A is: " + seta.smallest());
        
        //testing union function pre and post union 
        System.out.println("Set A pre union: " + seta.toString());
        seta.union(setb);
        System.out.println("Set A post union: " + seta.toString());
        setb.add(27);
        setb.add(36);
        setb.add(44);
        setb.add(55);
        
        //testing remove function for error/ exception 
        setb.remove(1500);
        
        //testing intersection function pre and post intersection
        System.out.println("Set B pre intersection: " + setb.toString());
        setb.intersect(seta);
        System.out.println("Set B post intersection: " + setb.toString());
        seta.add(5);
        //testing difference function pre and post difference 
        System.out.println("Set A pre difference: " + seta.toString());
        seta.diff(setb);
        System.out.println("Set A post difference: " + seta.toString());
        
        //testing clear function 
        System.out.println("Set A is Empty: " + seta.isEmpty());
        seta.clear();
        System.out.println("Set A is Empty: " + seta.isEmpty());
	 }
}
