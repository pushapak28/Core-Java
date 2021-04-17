package com.basicprograms;

import java.util.Scanner;

public class oddeven {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int a=sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Even Number "+a);
		}
		else {	
			System.out.println("Not an even Number ");
			}
	}
}
