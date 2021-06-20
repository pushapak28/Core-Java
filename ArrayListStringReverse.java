package string;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayListStringReverse {

	public static void main(String[] args) {
		
		String str = "Pushapak kumar baghel";
		
		char[] charArray = str.toCharArray();
		
		List<Character> rev = new ArrayList<Character>();
		
		for (char c : charArray) {
			rev.add(c);
		}
		Collections.reverse(rev);
		ListIterator<Character> li = rev.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next());
		}
		System.out.println();
		System.out.println(rev);
		
	}

}
