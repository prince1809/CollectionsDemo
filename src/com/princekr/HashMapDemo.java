package com.princekr;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		// create a new hash map
		HashMap<String, Double> hm = new HashMap<>();
		
		//Put elements to the map
		hm.put("Prince", new Double(3010.50));
		hm.put("Rahul", new Double(123.15));
		hm.put("Ankit", new Double(100.11));
		hm.put("Vinay", new Double(-190.22));
		
		// Get a set of entries
		Set<Entry<String, Double>> set = hm.entrySet();
		
		// Get an iterator
		Iterator<Entry<String, Double>> it = set.iterator();
		
		// Display Elements
		while (it.hasNext()){
			Map.Entry<String,Double> me = (Map.Entry<String,Double>)it.next();
			System.out.println(me.getKey() + ": " + me.getValue());
		}
		// Deposit 1000 into prince's account
		double balance = ((Double)hm.get("Prince")).doubleValue();
		hm.put("Prince", new Double(balance + 1000));
		System.out.println("Prince's new Balance is: " + hm.get("Prince"));

	}

}
