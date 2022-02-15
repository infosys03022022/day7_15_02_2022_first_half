package infosys.demo2.method.overriding;

public class Derived extends Base {
	   
		public void derivedDisplay() {
			System.out.println("I am the display method of the derived class");
		}
		
		public void display() {
			System.out.println("I am the overriding  method in the subclass");
		}
}
