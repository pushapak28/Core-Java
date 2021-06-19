package polymorphism;

class Parent{
	void print() {
		System.out.println("Parent Class");
	}
}
class Child1 extends Parent{
	void print() {
		System.out.println("Child 1 Class");
	}
}
class Child2 extends Parent{
	void print() {
		System.out.println("Child 2 Class");
	}
}


public class RunTimePolymorphism {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.print();
		
		p = new Child1();
		p.print();
		
		p=new Child2();		
		p.print();
	}

}
