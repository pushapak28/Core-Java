package com.solution;

import java.util.Scanner;

public class FindTypeWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// use method endsWith
		
					Scanner sc = new Scanner(System.in);
					String str = sc.next();
					
					if(str.endsWith(".com")) 
					{
						System.out.println("Commercial Websites! ");
					}
					else if(str.endsWith(".org"))
					{
						System.out.println("Organizational Website! ");
					}
					else if(str.endsWith(".in")){
						System.err.println("Indian Website!");
					}
					sc.close();
		}

}
