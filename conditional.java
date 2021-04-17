package com.basicprograms;

import java.util.Scanner;

public class conditional{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if loop
		int age=23;
		if(age>=23) {
			System.out.println("Eligible for Scholar");
		}
		else {
			System.out.println("Not eligible");
		}
		
		//	user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age1=sc.nextInt();
		if(age1>=23) {
			System.out.println("Eligible for Scholar");
		}
		else {
			System.out.println("Not eligible");
		}
	}

}
