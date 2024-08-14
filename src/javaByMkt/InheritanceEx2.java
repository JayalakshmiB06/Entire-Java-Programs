package javaByMkt;

 class InheritanceEx2 
{
    void add(short i, int j)
    {
    	System.out.println(i+j);
	}
   static void string()
    {
    	String s= "Jayalakshmi";
    	System.out.println(s);
    }
}
 class InheritanceEx extends InheritanceEx2
{
	void sub()
	{
		byte c = 120; double d = 25.50;
		System.out.println(c+d);
	}
	static void mul(int a, int b)
	{
		System.out.println(a*b);
	}

public static void main(String[] args) 
{
	InheritanceEx I1 = new InheritanceEx();
	I1.add((short) 150,34000);
	string();
	I1.sub();
	mul(10,20);
	
}
}
