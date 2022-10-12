package com.demo;

import java.util.Scanner;

public class check2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n,res;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of n:");
		n= sc.nextInt();
		
		res = smithnumbers(n);
		
		System.out.println(res);
		

	}
	
	static boolean checkPrime(int a){
		int i,c=0;
		
		for(i=1 ; i<=a ; i++){
			if(a%i == 0)
				c++;
		}
		
		if(c == 2)
			return true;
		else
			return false;
	}
	
	static int sumDigit(int a){
		int d=0;
		// sum of digit 
					while(a>0){
						d = d + a%10;
						a = a/10;
					}
		return d;
	}
	
	static int smithnumbers(int n){
		
		int sum=0,i,d=0;
		
		if(checkPrime(n) == false){
			
			d = sumDigit(n);
			System.out.println("sum digit :"+d);
			// sum of prime factors
			for(i=1 ; i<=n ; i++){
				if(n%i == 0 && checkPrime(i)){
					System.out.print(i+"  ");
					sum = sum + sumDigit(i);
				}
					
			}
			
			System.out.println("sum of factor digit"+sum);
			
			if(d == sum){
				return d;
			}
			else 
				return -1;
			
		}
		else{
			System.out.println("prime");
			return -1;
		}
		
	}

}
