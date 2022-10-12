package com.demo;

public class check6 {

	static boolean unique(String s , int k){
		
		int c=0;
		char ch;
		String chr;
				
		for(int i=0 ; i<s.length() ; i++){
			ch = s.charAt(i);
			chr = ch + "";
			if(ch != '0'){
				c++;
				s = s.replaceAll(chr,"0");
			}
		}
		if(c == k)
//			System.out.println("String has "+k+" unique char");
			return true;
		else
//			System.out.println("String does not have "+k+" unique chars");
			return false;
	}

	
	public static void main(String[] args) {
		
		String str = "aabbacbaa";
		String s;
		char ch;
		int c=0,index=0,max=0;
		String com[] = new String[50];
		
		for(int i = 0 ; i<str.length() ; i++){
			ch = str.charAt(i);
			for(int j = i+1 ; j<=str.length() ; j++){
				s = str.substring(i, j);
				if(unique(s, 2)){
					com[c++] = s;
				}
			}
			
		}
		
		for(int i = 0 ; i<com.length && com[i]!= null ; i++){
			if(com[i].length() > max){
				max = com[i].length();
				index = i;
			}
		}
		
		System.out.println("Max possible char = "+com[index]);

	}

}
