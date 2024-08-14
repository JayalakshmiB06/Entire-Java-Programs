//How to call constructor inside main method

package JavaAssignmentPrgms;

public class Calling_Constructor {
	
	Calling_Constructor()
		{
			System.out.println("Invoke constructor in main method");
		}
		public static void main(String[] args) 
		{
			Calling_Constructor M1 = new Calling_Constructor(); // Syntax 1 constructor will be invoked/callled the moment you create an object
		    new Calling_Constructor(); // syntax 2
		}

	}


