package com.datastructureandalgorithm;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of an array!");
		int n =sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter element to find !");
		int to_find= sc.nextInt();
		
		System.out.println("Enter Element for binary Search array");
			for(int i=0;i<n;i++) {
				
				a[i]=sc.nextInt();
			}
			
			int low=0,hig = n-1,mid;
			while(hig-low>1) {
				int mid1 =(hig+low)/2;
				if(a[mid1]<to_find) {
					low = mid1 + 1;
				}else {
					hig = mid1;
				}
			}
			
				if(a[low] == to_find)
				{
					System.out.println(low + "Position");
				}
				else if(a[hig] == to_find)
				{
					System.out.println(hig +"Position");
				}
				else
				{
					System.out.println("! Not Found");
				}
			
		sc.close();
	}

}
