package infosys.demo2.method.overriding;

public class Main {

	public static void main(String[] args) {
	Base base=new Base();
	base.baseDisplay();// This is a method only in the base class
	base.display();  // This is a method which is there in both 
	// base class and derived class so in this case display of the 
	// base class will be called
    Derived derive=new Derived();
    derive.baseDisplay();  // first it will search in the 
    // derived class , it wont find and then it will search in the 
    // base class and now it is there in the base class
    derive.derivedDisplay(); // It will search in the derived class
    // and it finds the derivedDisplay() in the derived
    // class and it is executed
    derive.display();
    // In line 18, it calls the display(),
    // display is there in both the base and derived class
    // So first it checks the display method in the
    // derived class and as the display method is there
    // it called the display method of the derived class
    base=new Derived();
    base.baseDisplay();
    // Here first it checks whether we have a
    // signature of the baseDisplay in the 
    // base class or not , yes baseDisplay we
    // have in the base class . Now it checks the
    // baseDisplay in the derived class but we
    // don't have baseDisplay in the derived class.
    // So the baseDisplay of the Parent class is called.
   // base.derivedDisplay();
   // In line 33 , it checks whether we have
    // derivedDisplay() in the base class ,
    // but we dont have. As we dont have any 
    // signature of the derivedDisplay in the base class
    // and as we are trying to invoke the method
    // with the reference of Base type, it gives
    // compilation error
    base.display();
    // For line 41, first it checks whether we
    // are having any signature of the display method
    // in the base class . Yes we have display method
    // in the base class. Now as the object is of
    // derived type it checks whether we have 
    // the overridden form of display method in the
    // derived class. Yes we have , in that case
    // derived class display method is called
    // How we can call a method of the derived class
    // which is only present in the derived class
    // So our requirement is through the reference
    // of the base type we want to call the method
    // which is only there in the derived class
    //base.derivedDisplay();
	 Derived d=(Derived)base;
	 // So the solution is just typecast base 
	 // back to derived class reference so that
	 // you can call the method which is specific
	 // to the derived type.
	 d.derivedDisplay();
	}

}
