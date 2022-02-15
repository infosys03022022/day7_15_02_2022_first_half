package infosys.demo.polymorphism;

public class Number {
	  private int num1;
	  private int num2;
	  private int num3;
	  
	  // So both the add methods we cannot write 
	  // as they are different with the return type only
	  // but difference in return type cannot be used
	  // to decide method overloading 
	  public int add() {
		  return num1+num2+num3;
	  }

		/*
		 * public void add() { System.out.println(num1+num2+num3); }
		 */
	  public void add(int num1, int num2, int num3) {
		  this.num1=num1;
		  this.num2=num2;
		  this.num3=num3;
		  int sum=this.num1+this.num2+this.num3;
		  System.out.println(sum);
	  }
		/*
		 * public int add(int num1, int num2, int num3) { this.num1=num1;
		 * this.num2=num2; this.num3=num3; int sum=this.num1+this.num2+this.num3; return
		 * sum; }
		 */

}
