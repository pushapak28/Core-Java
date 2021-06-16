package OOPS;

class Name{
	public void name() {
		System.out.println("Name Jacky!");
		}
}
class Dog extends Name  {
		public void dog_breed() {
			System.out.println("PitBull");
		}
}
class Cat extends Name{
	public void cat_breed() {
		System.out.println("Cat Breed.");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.name();
		cat.cat_breed();
		
		Dog dog = new Dog();
		dog.name();
		dog.dog_breed();
		
		
	}

}
