package JavaAssignmentPrgms;

import java.util.Scanner;

public class Ony_Alphabets_string 
{
public static boolean Inputstring()
{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter Input String");
	String Input = sc.next();
	
	for (int i =0; i< Input.length();i++)
	{
		if(Character.isDigit(Input.charAt(i)))
		{
			return false;
		}
	}
	return true;
}	
public static void main(String[] args) 
{
	System.out.println(Inputstring());	

}

}
