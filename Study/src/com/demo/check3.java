package com.demo;

import java.util.Scanner;

public class check3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,m;
		System.out.println("enter value of m :");
		m = sc.nextInt();
		
		int mat[][] = new int[m][m];
		
		System.out.println("Enter value of matrix:");
		for(i=0 ; i<m ; i++){
			for(j=0 ; j<m ; j++){
				mat[i][j] = sc.nextInt();
				}
			}
		
		printMatrix(mat , m);
		
		replaceMatrix(mat , m);
		
		printMatrix(mat , m);
		}
	
	public static int[][] replaceMatrix(int temp[][] , int m){
		
		int i,j,k;
		
		for(i=0 ; i<m ; i++){
			for(j=0 ; j<m ; j++){
				if(i == j){
				 if((i-1)<0 && (j-1)<0)
					 temp[i][j] = temp[i+1][j]+temp[i][j+1]+temp[i+1][j+1];
				 	else if((i+1)>m-1 && (j+1)>m-1)
				 		temp[i][j] = temp[i-1][j]+temp[i][j-1]+temp[i-1][j-1];
				 	else
				 temp[i][j] = temp[i+1][j]+temp[i][j+1]+temp[i-1][j]+temp[i][j-1]+temp[i+1][j+1]+temp[i-1][j-1]+temp[i-1][j+1]+temp[i+1][j-1];
				}
				
			}
		}
		
		return temp;
	}
	
	static void printMatrix(int mat[][] , int m){
		int i,j;
		for(i=0 ; i<m; i++){
			for(j=0 ; j<m ; j++){	
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	

}
