package viva;

public class encapsulation_prgm {
public String UN;
public String PWD;

public String getUN()
{
	return UN;
}

public void setUN(String UN)
{
	 this.UN=UN;
}

public String getPWD()
{
	return PWD;

}
public void setPWD(String PWD)
{
	this.PWD=PWD;
	}
	public static void main(String[] args) 
	{
		
		encapsulation_prgm e1= new encapsulation_prgm();
		e1.setUN("jayabogavelly006@gmail.com");
		e1.setPWD("Abc@123");
		System.out.println(e1.getUN());
		System.out.println(e1.getPWD());
	}

}
