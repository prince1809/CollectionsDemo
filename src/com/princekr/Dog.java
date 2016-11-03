package com.princekr;

import java.util.Comparator;

public class Dog  implements Comparator<Dog>, Comparable<Dog>{
	
	private String name;
	private int age;
	
	public Dog(){
		
	}

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getDogName(){
		return this.name;
	}
	
	public int getDogAge(){
		return this.age;
	}

	@Override
	public int compareTo(Dog d) {
		return (this.name).compareTo(d.name);
	}

	// overriding the compare method to sort the age
	@Override
	public int compare(Dog d1, Dog d2) {
		return d1.age - d2.age;
	}

}
