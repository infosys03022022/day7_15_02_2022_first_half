package infosys.demo.revise;
         public class Demo6 {
         int i=20;
         public static void main(String str[]){
         int i=10;  // Local variables are having high preference
         // than instance variables
         System.out.println(i);  //10
        }
      }