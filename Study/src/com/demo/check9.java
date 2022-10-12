package com.demo;
import java.util.*;

public class check9 {
	
	public static int sumArray(int a[] , int m , int n){
		int sum=0;
		for(int i = m ; i<=n ; i++){
			sum = sum + a[i];
		}
		
		return sum;
	}
	
	public static int[] calcSubArray(int a[]){
		int k = 0;
		int temp[] = new int[100];
		for(int i = 0 ; i < a.length ; i++){
			for(int j=0 ; j<a.length ; j++){
				temp[k++] =  sumArray(a, i, j);
			}
		}
		
		return temp;
	}
	
	public static void sort(int a[]) {
		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,k;
		int result[] = new int[100];
		
		System.out.println("Enter value of A : ");
		n = sc.nextInt();
		int A[] = new int[n];
		System.out.println("Enter value of K : ");
		k = sc.nextInt();
		System.out.println("Enter elements in A: ");
		for(int i=0; i<n ; i++){
			A[i]= sc.nextInt();
		}
		
		result = calcSubArray(A);
		sort(result);
		System.out.println("temp array is : ");
		for(int a : result){
			if(a != 0)
			System.out.println(a);
		}
		System.out.println("Kth element is : " + result[k-1]);

	}

}
