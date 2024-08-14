package JavaAssignmentPrgms;

public class Encapsulation_prgm {
 private String Name;
 private int age;
 public String getName()
 {
	 return Name;
 }
public void setName(String Name)
{
	this.Name = Name;
}
public int getage()
{
	 return age;
}
public void setage(int age)
{
	this.age = age;
}
public static void main(String[] args) 
{
	Encapsulation_prgm EP = new Encapsulation_prgm();
	EP.setName("Ramu");
	EP.setage(35);
	System.out.println(EP.getName());
}
}
