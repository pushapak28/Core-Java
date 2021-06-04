import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    // Question multiplication tables
    
		System.err.println("Enter a Number for multiplication: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=10;i++) {
			System.out.println(n+" "+ " * "+ i+" = "+(n*i));
			
		}
		//Question  multiplication table in reverse  
		
    System.out.println("\n");
		for(int i = 10;i>0;i--)
		{
			System.out.println(n+" "+ " * "+ i+" = "+(n*i));
		}
		
		
		sc.close();
	}

}
