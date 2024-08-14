package javaByMkt;

public class MethodOverloading2 {

	public static void main(String[] args) {
		MethodOverloading2 M1 = new MethodOverloading2 ();
		M1.add();
		add(100,200);
		new MethodOverloading2 (0.05f,3.15f);
		M1.add(10);
	}
void add ()
{
	int a = 10, b =20;
	System.out.println(a+b);
}
static void add (int a, int b)
{
	System.out.println(a+b);
}
MethodOverloading2 ()
{
	float a = 3.15f, b = 3.45f;
	System.out.println(a+b);
}
MethodOverloading2 (float a, float b)
{
	System.out.println(a+b);
}
int add (int a)
{
	a = 20;// updating of value
	System.out.println(a+30);
	return a;
}
}
