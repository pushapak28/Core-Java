package com.solution;

import java.util.Scanner;

public class CH5_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//Question 1 : print patter
//		int a = sc.nextInt();
		
		int a =5;
		for(int i = 1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+" * "+" ");
			}
			System.out.println(" "+"\n");
		}
			
		for (int i=a;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+" * "+" ");
			}
			System.out.println(" "+"\n");
		}
		
		
		
		sc.close();
	}

}
