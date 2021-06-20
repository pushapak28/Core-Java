package string;

public class ReverseStringByte {

	public static void main(String[] args) {
		
		String str = "Pushapak Kumar Baghel";
		
		// string to byte array 
		byte [] stringasByte = str.getBytes();
		byte[] result = new byte[stringasByte.length];
		
		// store reverse value to the result array
		for(int i =0 ; i<stringasByte.length;i++ ) {
			result[i] = stringasByte[stringasByte.length-i-1];
		}
		// type cast to string
		String strreverse = new String(result);
		System.out.println(strreverse);
		
	}

}
