package Loops;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean isPrime = true;
		
		for(int i=2;i<n;i++) {
			if(n%i == 0) {
				isPrime = false;
			}
		}
		if(n<2) isPrime = false;
		System.out.println("IS Prime  "+isPrime);
		
		sc.close();
	}

}
