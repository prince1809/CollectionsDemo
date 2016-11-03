package com.princekr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
	
	public static void main(String args[]){
		// Take a list of Dog Objects
		List<Dog> list = new ArrayList<Dog>();
		
		list.add(new Dog("Shaggy", 3));
		list.add(new Dog("Lacy", 2));
		list.add(new Dog("Roger", 10));
		list.add(new Dog("Tommy", 4));
		list.add(new Dog("Tammy", 1));
		
		//sorts the ArrayList
		Collections.sort(list);
		
		for(Dog d: list){
			System.out.print(d.getDogName() + ", ");
		}
		
		System.out.println();
		
		// Sort the ArrayList using comparator
		Collections.sort(list, new Dog());
		for(Dog d: list){
			System.out.print(d.getDogName() + " : " + d.getDogAge() + ", ");
		}
		
		
	}
}
