package com.demo;

import java.util.Scanner;

public class check8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num,den,a,b;
		
		System.out.print("Enter num : ");
		num = sc.nextInt();
		System.out.print("Enter den : ");
		den = sc.nextInt();
		a = Math.max(den, num);
		b = Math.min(den, num);
		
		for(int i = 2 ; i < b; i++){
			if(b%i == 0 && a%i == 0){
				a=a/i;
				b=b/i;
			}
		}
		
		System.out.println("Simplified fraction is : " +a+"/"+b);

	}

}
