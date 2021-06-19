package polymorphism;

class MultiplyFun{
	
	static int multiply(int x, int y) {
		return x*y;
	}
	
	static double multiply(double x ,double y) {
		return x*y;
	}
}
public class MethodOverloadingPolymorphism {

	public static void main(String[] args) {
		
//		MultiplyFun obj = new MultiplyFun();
		System.out.println("Multiply integer : "+ MultiplyFun.multiply(2, 3)); 
		System.out.println("Multiply double : "+ MultiplyFun.multiply(2.3, 5.2));

	}

}
