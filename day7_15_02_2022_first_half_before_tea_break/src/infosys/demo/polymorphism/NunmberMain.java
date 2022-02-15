package infosys.demo.polymorphism;

public class NunmberMain {

	public static void main(String[] args) {
		Number number=new Number();
		int sum=number.add();
        System.out.println(sum);
        number.add(100,200,300);
        
	}

}
