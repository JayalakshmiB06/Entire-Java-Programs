package JavaAssignmentPrgms;

abstract class GarndParentclass
{
	abstract void add();
	abstract void mul();
	void sub()
	{
		System.out.println("subtraction");
	}
}
abstract class Parentclass extends GarndParentclass
{
	abstract void mod();
	abstract void name();
	void div()
	{
		System.out.println("division");
	}
}

 public class Abstraction_Ex1 extends Parentclass
{
  static void CM1()
  {
	  System.out.println("Concrete method 1");
  }
  void CM2()
  {
	  System.out.println("Concrete method 2");
  }
  public static void main(String[] args) 
  {
	  Abstraction_Ex1 A1 = new Abstraction_Ex1 ();
	  CM1();
	  A1.CM2();
	  A1.mod();
	  A1.sub();
	  A1.add();
	  A1.div();
	  A1.mul();
	  A1.name();
	  
		
  }

void mod() 
{
	
	int a =10,b=100;
	System.out.println(a%b);
}

void name() {
	
	System.out.println("Jayalakshmi");
	
}

void add() 
{
	
	int a =10,b=100;
	System.out.println(a+b);
}

void mul() 
{
	
	int a =10,b=100;
	System.out.println(a*b);
}
  
}
