package com.princekr;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

	public static void main(String[] args) {
		
		//create the sorted set
		SortedSet<String> set = new TreeSet<>();
		
		// Add elements to the set
		set.add("Prince");
		set.add("Ankit");
		set.add("Rahul");
		
		// Iterate over the elements in the set
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			//get the elements
			Object element = it.next();
			System.out.println(element.toString());
		}

	}

}
