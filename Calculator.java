package Conditional;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "!CALCULATOR!";
		for (int i=0;i<str.length();i++)
		{
			System.out.print("\t"+str.charAt(i));
		}
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\nChoose Which Operation You want to Perform!\t");
		System.out.println("1. Addition:\t ");
		System.out.println("2. Subtraction:\t");
		System.out.println("3. Multiplication:\t");
		System.out.println("4. Divide:\t");
		
		int c= sc.nextInt();
		System.out.println("Enter First Number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();
		
		switch(c) {
		case 1 : System.out.println("Addition: =  "+(a+b));
		break;
		case 2 : System.out.println("Subtraction: = "+(a-b));
		break;
		case 3 : System.out.println("Multipication: = "+(a*b));
		break;
		case 4 : System.out.println("Divide: = "+(a/b));
		break;
		default:System.out.println("Invalid Selection !");
		break;
		
		}
		
		sc.close();
	}

}
