package JavaAssignmentPrgms;

public class Reverse_String 
{
public static void main(String[] args) 
{
	String Original = "jaya";
	String Reverse = "";
	
	for(int i=Original.length()-1; i>=0;i--)
	{
		Reverse = Reverse+Original.charAt(i);
	}
	System.out.println(Reverse);
}
}



