package com.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;



public class check11 {
	
	static int c=0;
	
	public static void count() {
		c++;
	}

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>(){{
			add("Manav");
			add("Prince");
			add("Satyam");
			add("Satyam");
			add("Prince");
			add("Prince");
			add("Prince");
			add("Manav");
			add("Manav");
			add("Manav");
			add("Satyam");
			add("Satyam");
			add("Satyam");
			add("Satyam");
			add("Satyam");
			add("Satyam");
			add("Manav");
			add("Manav");
			add("Manav");
			add("Manav");
			add("Manav");
		}};
		
		//Hashset store only unique elements
		HashSet<String> unique=new HashSet<String>();
		
		a.forEach(item ->{
			if(!unique.add(item)) {
				check11.count();			}
		});
		
		System.out.println("Unique elements are :"+unique.size());
		System.out.println("No of duplicate elements : "+c);

	}

}
