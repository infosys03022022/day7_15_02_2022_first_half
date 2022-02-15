package infosys.demo.polymorphism;
class Customer {
	private String customerId;
	private String customerName;
	private long contactNumber;
	private String address;
	// Parameterless constructor
	public Customer() {
		System.out.println("Inside parameterless constructor");
	}
	// Parameterized constructor
	public Customer(String customerId, String customerName, long contactNumber,
			String address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	// Parameterized constructor
	public Customer(String customerName, long contactNumber, String address) {
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	// Methods including getter and setter and other methods
}
public class Tester {
	public static void main(String[] args) throws Exception {
		/*
		 Parameterless constructor will be invoked, instance variables should
		 be initialized using setter methods
		 */
		Customer customerOne = new Customer();
		/*
		 Parameterized constructor with four parameters instance variables are
		 initialized in the constructor
		 */
		Customer customerTwo = new Customer("C1016", "Stephen Abram",
				7856341287L, "A/22 Delhi");
		/*
		 Parameterized constructor with three parameters instance variables
		 are initialized in the constructor
		 */
		Customer customerThree = new Customer("James Jonathan", 7828171287L,
				"223/1 Kolkata");
	}
}
