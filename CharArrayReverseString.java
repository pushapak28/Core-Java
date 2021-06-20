package string;

public class CharArrayReverseString {

	public static void main(String[] args) {
		
		String str = "Pushapak Kumar Baghel";
		
		char[] charArray = str.toCharArray();
		
		for(int i = charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}

	}

}
