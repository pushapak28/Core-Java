package Loops;

import java.util.Scanner;

public class PatternTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		// Down Triangle
	
		for(int i =1 ;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
		//TRiangle
		/*for(int i =1 ;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}*/
		
			
		sc.close();
	}
}
