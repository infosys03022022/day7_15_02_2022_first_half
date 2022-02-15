package infosys.demo.revise;

public class Demo1 {
// Without any command line arguments
// the length is 0
// set the command line arguments
	// Hello world are two arguments
	// args.length====>2
	// 
	public static void main(String[] args) {
		System.out.println(args.length);
        System.out.println(args[0]);
        System.out.println(args[1]);
        for(String str : args)
        {
        	System.out.println(str);
        }
        
        for(int i=0;i<args.length;i++)
        {
        System.out.println(args[i]);	
        }
	}

}
