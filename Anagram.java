package String;

import java.util.Scanner;

public class Anagram {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 to Compare");
		String str1= sc.next();
		System.out.println("Enter String 2 to Compare");
		String str2 = sc.next();
		
		boolean isAnagram = false;
		boolean visited[] = new boolean[str2.length()];
		
		if(str1.length()==str2.length())
		{
				
				for(int i=0;i<str1.length();i++) {
					char c = str1.charAt(i);
					//isAnagram=false;
					for(int j=0;j<str2.length();j++) {
						if(str2.charAt(j)==c && !visited[j]) {
							visited[j]=true;
							isAnagram = true;
							break;
						}
					}
					if(!isAnagram) {break;}
				}
		 }
		
		if(isAnagram) {
			System.out.println("Anagram ");
		}
		else {
			System.out.println("Not an Anagram");
		}
		sc.close();
	}

}
