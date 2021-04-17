package com.basicprograms;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Color");
		String s1 =sc.next();
		
		switch(s1){
		case "red":System.out.println("Color is Red!");
		break;
		case "green":System.out.println("Color is Green");
		break;
		case "yellow":System.out.println("Color is Blue");
		break;
		default:System.out.println("Invalid! Select from RGB");
		
		}
	}
}
