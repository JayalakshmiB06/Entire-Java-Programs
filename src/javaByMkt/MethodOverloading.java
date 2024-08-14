package javaByMkt;

public class MethodOverloading {
    void add()
    {
    	int a= 100;
    	System.out.println(a+6);
	}
  static void add(int a)
    {
    	System.out.println(a+6);
	}
    void add(int a,int b)
    {
    	System.out.println(a+b);
	}
    static void add(double c)
    {
    	c = 3.456; // updating the value
    	System.out.println(c+6);
	}
    public static void main(String[] args) {
		MethodOverloading M1 = new MethodOverloading();
		M1.add();
		add(80000);
		M1.add(10,20);
		add(3.14);
		
	}
}

/* We can overload both static and non-static methods but with different parameters.
The need of method overloading is to do the same activity in multiple ways.
We can overload main method */
