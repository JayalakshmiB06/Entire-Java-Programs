//prgm to call both static and nonstatic methods inside main method

package JavaAssignmentPrgms;
public class Calling_StaticMethod_NonStaticMethod {

	  void nonstatic()
	    {
	    	System.out.println("Invoke non-static method");
	    }
	    static void StaticMethod()
	    {
	    	System.out.println("Invoke static method");
	    }
	  
	    public static void main(String[] args)
		{
	    	Calling_StaticMethod_NonStaticMethod C4 = new Calling_StaticMethod_NonStaticMethod();
	    	C4.nonstatic();
	    	StaticMethod();
	}
	}
