package infosys.demo.polymorphism;

// Constructor overloading
// Constructors are having the same name
// as that of class
// But in our example , one of the constructor
// is without any parameter and
// another constructor is with 3 parameters
public class Number2 {
	private int num1;
	private int num2;
	private int num3;
	
	public Number2() {
		num1=1;
		num2=2;
		num3=3;
		System.out.println("I am the parameterless constructor");
	}
	
	public Number2(int num1, int num2, int num3)
	{
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
		System.out.println("I am the parameterized constructor");
		
	}

}
