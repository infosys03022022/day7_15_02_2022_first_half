package infosys.demo.polymorphism;

// So the following example is
// of constructor overloading
// in String class
// String(String str)
// String(char array[]) 
public class Demo2 {

	public static void main(String[] args) {
		
		String str1=new String("Hello");
		System.out.println(str1);
		char array[]= {'h','e','l','l','o'};
		String str2=new String(array);
		System.out.println(str2);

	}

}
