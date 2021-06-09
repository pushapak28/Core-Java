package DataStructures;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size ");
		int n =sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Enter array ");
		for(int i = 0 ;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i =0;i<a.length-1;i++) {
			int minIndx = i;
			for(int j=i;j<n;j++) {
				if(a[j]<a[minIndx]) {
					minIndx = j;
				}
			}
			int temp =a[i];
			a[i]=a[minIndx];
			a[minIndx]=temp;
		}
		for(int item:a) {
			System.out.print(item+" ");
		}
		sc.close();
				

	}

}
