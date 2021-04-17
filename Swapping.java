package com.basicprograms;

public class Swapping {

	public static void main(String[] args) {
		
	//swapping of two number 
		
		int a =23;
		int b=34;
	
		//With third variable
		//		int c = a , a=b,  b=c
//	int c=a;
//	a=b;
//	b=c;
//	System.out.println("A "+a);
//	System.out.println("B "+b);
		
		// Without third variables
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("A "+a);
		System.out.println("B "+b);
	}

}
