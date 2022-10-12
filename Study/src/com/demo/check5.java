package com.demo;

public class check5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String res = "";
		String str = "abc*def";
		String s[] = str.split("\\*");
		String s1 = s[0];
		String s2 = s[1];
		
		for(int i=0 ; i< s1.length() ; i++){
			res = res + s1.charAt(i) + s2.charAt(i);
		}
		
		System.out.println("Result is : "+res);

	}

}
