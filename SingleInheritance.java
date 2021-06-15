package OOPS;

class A{
	public void first_name() {
		System.out.print("Pushapak ");
	}
}
class B extends A{
	public void last_name() {
		System.out.print("Kumar ");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		B obj = new B();
		obj.first_name();
		obj.last_name();
	}

}
