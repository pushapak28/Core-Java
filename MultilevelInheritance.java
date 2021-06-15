package OOPS;
class A1{
	public void first_name() {
		System.out.print("Pushapak ");
	}
}
class B1 extends A1{
	public void middle_name() {
		System.out.print("Kumar ");
	}
}
class C extends B1{
	public void last_name() {
		System.out.print("Baghel ");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		C obj = new C();
		obj.first_name();
		obj.middle_name();
		obj.last_name();
	}

}
