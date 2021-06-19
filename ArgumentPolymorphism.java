package polymorphism;

class MultiplyFun1{
	static int multiply(int x, int y) {
		return x*y;
	}
	static int multiply(int x , int y , int z) {
		return x*y*z;
	}
}
public class ArgumentPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(MultiplyFun1.multiply(5, 10));
		System.out.println(MultiplyFun1.multiply(5, 10, 20));
	}

}
