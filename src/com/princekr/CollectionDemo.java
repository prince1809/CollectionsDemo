package com.princekr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {
		
		//ArrayList
		List<String> a1 = new ArrayList<>();
		a1.add("Prince");
		a1.add("Ankit");
		a1.add("Aniket");
		System.out.print("ArrayList Elements: ");
		System.out.println(a1);
		
		// LinkedList
		List<String> l1 = new LinkedList<>();
		l1.add("Prince");
		l1.add("Aish");
		l1.add("Vivek");
		System.out.println("LinkedList Elements: " + l1);
		
		//Hashset
		Set<String> s1 = new HashSet<>();
		s1.add("Prince");
		s1.add("Amit");
		s1.add("Rakesh");
		System.out.println("Hashset Elements: " + s1);
		
		//HashMap
		Map<String,String> m1 = new HashMap<>();
		m1.put("Prince","8");
		m1.put("Nitin","31");
		m1.put("Rahul", "15");
		System.out.println("HashMap Elements: " + m1);
		
	}

}
