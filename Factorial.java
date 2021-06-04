
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

    // Factorial
		
		int n = sc.nextInt();
		int fact = 1;
		for( int i = 1 ; i <= n;i++ ) {
			fact = fact*i;
		}
		System.out.println(fact);
		sc.close();
		
			// using while loops
		// int n = sc.nextInt();
       // What is factorial n = n * n-1 * n-2 ..... 1
       // 5! = 5*4*3*2*1 = 120
	       int i = 1;
	       int factorial = 1;
	       while(i<=n){
	           factorial *= i;
	           i++;
	       }
	       System.out.println(factorial);
		 
}

}
