// // Write a prgm to call non-static method into main method

package JavaAssignmentPrgms;

public class Calling_NonStaticMethod {
	
	void add()
	{
		byte a1 = 120;
		int a2 = 130;
		System.out.println(a1+a2);
	}
	 void sub()
	{
		byte a1 = 120;
		int a2 = 130;
		System.out.println(a1-a2);
	}
	 void mul()
	{
		byte a1 = 120;
		int a2 = 130;
		System.out.println(a1*a2);
	}
	 void div()
	{
		float a1 = 120f;
		float a2 = 130f;
		System.out.println(a1/a2);
	}
	 void mod()
	{
		byte a1 = 120;
		int a2 = 130;
		System.out.println(a1%a2);
	}
	public static void main(String[] args) 
	{
		Calling_NonStaticMethod A3 = new Calling_NonStaticMethod ();
		A3.add();
		A3.sub();
		A3.mul();
		A3.div();
		A3.mod();
	}

}

// You need create object of class first and then with the help of reference variable you can call non static methods inside static methods