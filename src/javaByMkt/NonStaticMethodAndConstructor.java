package javaByMkt;

public class NonStaticMethodAndConstructor {
	NonStaticMethodAndConstructor()
	{
		System.out.println("Invoke Contrsuctor");
	}
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
    	NonStaticMethodAndConstructor C1 = new NonStaticMethodAndConstructor();
    	C1.nonstatic();
    	StaticMethod();
}
}
