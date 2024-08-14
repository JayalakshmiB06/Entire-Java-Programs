package javaByMkt;

public class LocalAndGlobalVariables 
{
	String Name = "Ram";
	int Age = 27;
	double Weight = 75.50;
	static String Marital_status = "Single";
	
	void biodata (String Name,int Age,double Weight)
	{
		System.out.println("My name is"+ " "+ Name+" " +"age is" +" "+ Age+" "+"Weight is"+" "+Weight );
	}
	
public static void main(String[] args) 
{
	LocalAndGlobalVariables LG1 = new LocalAndGlobalVariables();
	LG1.Name = "RamaKrishna";
	System.out.println(LG1.Name);
	System.out.println(LG1.Age);
	System.out.println(Marital_status);
	LG1.biodata("Sita",25,60.25);

}

}
