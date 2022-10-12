package com.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

class check10 {
	
	static void test() {
		System.out.println("This is test function");
	}

	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<Integer>(){{
			add(5);
			add(800);
			add(42);
			add(50);
			add(25);
			add(92);
			add(50);
			add(50);
			add(50);
			add(50);
			add(50);
		}};
		
		a.stream().filter(temp -> {
			if(temp%5==0) {
				return true;
			}
			else
				return false;
		}).forEach(System.out::println);;
		
		//stores unique elements
		HashSet<Integer> unique = new HashSet<Integer>();
		
		a.forEach(item ->{
			unique.add(item);
		});
		
		System.out.println("SET is \n"+unique.toString());


	}

}
