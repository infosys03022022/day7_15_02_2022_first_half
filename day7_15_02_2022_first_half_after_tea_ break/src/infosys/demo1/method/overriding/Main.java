  package infosys.demo1.method.overriding;
     public class Main {
     public static void main(String args[]) {
        
    	 //In line 9 , reference variable
    	 // and the object is of same
    	 // type and which is of type
    	 // Parent
    	 Parent parent=new Parent();
         // So that is the reason that when display is
    	 // called it is of the parent class
    	 parent.display(); // I am the display method of the parent class
         //In line 15 The refernce is of Child type and
    	 // object is also of type child
    	 Child child=new Child();
    	 // So the display of the Child method is called
         child.display();   // I am the display method of the Child class
      // So the above line displays the message for the child because 
       // the method display is having the same return type, same method name , same number of
       // parameters( currently the methods are parameterless).
        // Reference is of base/parent type and
         // object is of Child/Derived/subclass type
         Parent parent2=new Child();
         parent2.display(); // It calls the display method of the child type because   
         // object is of the child type
         parent2=new ChildTwo();
         parent2.display(); // It call the display method of the ChildTwo type
         // Runtime polymorphism or dynamic polymorphism because depending on the object , 
         // the display method is called.
         // In line 23 . parent2 which is a reference of Parent type is storing the object of Child
         // so when we write parent2.display() in line 24 , it displays the content of display method 
         // in the Child class but in line 26 , now we are overwriting the address of parent2 as with
         // the address of ChildTwo object. Now parent2 is holding the reference of ChildTwo object 
         // and not of Child. So in line 27, when we call display() again , the display method of
         // ChildTwo class is called.
         // So this is called Dynamic polymorphism. 
          
       }
   }