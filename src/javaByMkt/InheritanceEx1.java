package javaByMkt;

public class InheritanceEx1 
{
	static void add(int a, int b)
	{
		System.out.println(a+b);
	}
}

 class Inheritance extends InheritanceEx1
{
    static void sub() 
    {
    	float a = 3.14f; double b = 3.14;
        System.out.println(a+b);
    }
public static void main(String[] args) 
{
	 add(10,45);
	 sub();

}

}
