package JavaAssignmentPrgms;
class Inheritance3
{
	void Gender(char a)
	{
		System.out.println(a);
	}
	static void Name (String s)
	{
		System.out.println(s);
	}
}
class Assignments extends Inheritance3
{
	void Height (double d)
	{
		System.out.println(d);
	}
	static void Age ()
	{
		System.out.println(25);
	}
	public static void main(String[] args)
	{
		Assignments A1= new Assignments();
		Age();
		A1.Height(5.7);
		A1.Gender('F');
		Name("Jaya");

	}
}

public class HierarchyLevelInhertitance extends Inheritance3
{
    void MobileNum(String MN)
    {
    	System.out.println(MN);
    }
    static void MaritalStatus(boolean b)
    {
    	System.out.println(b);
    }
	public static void main(String[] args)
	{
		HierarchyLevelInhertitance HLI1 = new HierarchyLevelInhertitance();
		HLI1.Gender('F');
		Name("Jaya");
		MaritalStatus(true);
	}
}
