package com.demo;

public class check4 {

	/**
	 * @param args
	 */

	public int[] sort(int b[]) {

		int i, j, temp;

		for (i = 0; i < b.length; i++) {
			for (j = i + 1; j < b.length; j++) {
				if (b[i] > b[j]) {
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}

		return b;
	}


	public static void main(String[] args) {
		
		check4 obj=new check4();
		int num = 0;
		
		int a[] = {1 ,2, 3 , 0 ,4 ,6 };
		
		int s[];
		
		s = obj.sort(a);
		
		for(int i = 0; i< a.length ; i++) {
			num =num +  s[i] * (int)Math.pow(10, i);
		}
		
//		num = s[0]*100 + s[1]*10 + s[2]*1;
		
		System.out.println("largest possible no = "+ num);


	}

}
