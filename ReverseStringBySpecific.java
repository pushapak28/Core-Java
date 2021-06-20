package string;

import java.util.Scanner;

public class   ReverseStringBySpecific{
		static String reverse(char[] str, int len,int l,int r) {
				
			if(l<0||r>=len||l>r)
				return "Invalid Positions";
			while(l<r) {
				char c = str[l];
				str[l] = str[r];
				str[r]=c;
				
				l++;
				r--;
			}
			String string = new String(str);
			return string ;
		}



	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String to Reverse");
		String str = sc.nextLine();
		int len = str.length();
		
		System.out.println("Enter String from where to start reverse and end ");
		System.out.println("Start");
		int l =sc.nextInt();
		System.out.println("End");
		int r=sc.nextInt();
		System.out.println("Reverse String :-");
		System.out.println(reverse(str.toCharArray(),len,l,r));

	sc.close();

		}
}
