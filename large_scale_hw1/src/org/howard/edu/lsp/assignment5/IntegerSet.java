package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet  {
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set;

	// Default Constructor
	public IntegerSet() {
		set = new ArrayList<Integer>();
	}

//	 Constructor if you want to pass in already initialized
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}
	
	public class IntegerSetException extends Exception {
        //constructor that prints out error by calling super()
        public IntegerSetException(String error) {
            super(error);
        }
    }

	// Clears the internal representation of the set
	public void clear() {
		set.clear();
	};
	
	// Returns the length of the set
	public int length() {
		return set.size();
	}; // returns the length
	
	/*
	 * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.  This overrides
	 * the equal method from the Object class.
	*/
	public boolean equals(IntegerSet o) {
//		IntegerSet new_set = o.set;
		if (set.size() != o.length()) {
            return false;
        }
        else {
            return set.containsAll(o.set);
        }
	}; 
	
	// Returns true if the set contains the value, otherwise false
	public boolean contains(int value) {
		return set.contains(value);
	};    
	
	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest() throws IntegerSetException {
		if (set.isEmpty()) {
            throw new IntegerSetException("The Set is Empty.");
        }
		else {
            int max = set.get(0);
            for (int i = 0; i < set.size(); i++) {
                if (set.get(i) > max) {
                    max = set.get(i);
                }
            }
            return max;
        }
	}; 
	
	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	public int smallest() throws IntegerSetException {
		if (set.isEmpty()) {
            throw new IntegerSetException("The Set is Empty.");
        }
		else {
            int min = set.get(0);
            for (int i = 0; i < set.size(); i++) {
                if (set.get(i) < min) {
                    min = set.get(i);
                }
            }
            return min;
        }
	}; 
	
	// Adds an item to the set or does nothing it already there	
 	public void add(int item) {
 		if (set.contains(item) == false) {
            set.add(item);
        }
 	};

	// Removes an item from the set or does nothing if not there
	public void remove(int item) {
		if (set.contains(item) == true) {
            set.remove(set.indexOf(item));
        }
	}; 
	
	// Set union
	public void union(IntegerSet intSetb) {
		for (int i = 0; i < intSetb.length(); i++) {
            if (set.contains(intSetb.set.get(i)) == false) {
                set.add(intSetb.set.get(i));
            }
        }
	};
	
	// Set intersection, all elements in s1 and s2
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
	}; 
	
	// Set difference, i.e., s1 –s2
	public void diff(IntegerSet intSetb) {
		for (int i = 0; i < intSetb.length(); i++) {
            if (set.contains(intSetb.set.get(i)) == true) {
                set.remove(intSetb.set.get(i));
            }
        }
	};
	
	// Set complement, all elements not in s1
	public void complement(IntegerSet intSetb) {
		List<Integer> tempSet;
		tempSet = new ArrayList<Integer>();
		for (int i = 0; i < intSetb.length(); i++) {
			if (set.contains(intSetb.set.get(i)) != true) {
				tempSet.add(intSetb.set.get(i));
			}
		}
		set.clear();
		set.addAll(tempSet);
	}
	
	// Returns true if the set is empty, false otherwise
	boolean isEmpty() {
		return set.isEmpty();
	}; 
	
	// Return String representation of your set
	public String toString() {
		String list = "";
        for (int i = 0; i < set.size(); i++) {
            list += set.get(i).toString() + ", ";
        }
        return list;
	};	// return String representation of your set
}
