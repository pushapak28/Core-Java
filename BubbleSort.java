package DataStructures;

import java.util.Scanner;

public class BuubleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size ");
		int n =sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Enter array ");
		for(int i = 0 ;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length-1;i++) 
		{boolean sorted = true;
			for(int j=0;j<a.length-1-i;j++)
			{
				
				if(a[j+1]<a[j]) 
				{
					int temp = a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					sorted = false;
				}
				
			}
			if(sorted) break;
		}
		System.out.println("Sorted Array ");
		for(int item:a) {
			System.out.print(item+ " ");
		}
		sc.close();
				

	}

}
