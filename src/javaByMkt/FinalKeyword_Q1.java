package javaByMkt;

public class FinalKeyword_Q1 
{
	final Double pi =3.14; int r=5;
	void Area_Of_Circle()
	{
    final double pi = 3.14;
    int r = 3;
    System.out.println(pi*r*r);
	}
	
	
public static void main(String[] args) 
{
	FinalKeyword_Q1 F1 = new FinalKeyword_Q1();
	F1.Area_Of_Circle();
    System.out.println("Circumference of circle is" + " "+2*F1.pi*F1.r);
    F1.r = 3;
    System.out.println(F1.r);
    //F1.pi = 1.25; -- You can't update the value of final viriable
}

}
