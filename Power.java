package Loops;
import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = 1;
		
		System.out.println(Math.pow(a, b));
		
		for(int i=0;i<b;i++) {
			result *=a;
		}
		System.out.println(result);
		sc.close();
	}

}
