package javaByMkt;

public class ifelseifSyntax2 
{

public static void main(String[] args) 
{
	boolean Finger_Print = true, Pass_code = true, Facial_Unlock = true;
	if (Finger_Print!=true)
	{
		System.out.println("Unlock phone with finger print");
	}
	   else if (Pass_code!=true)
	   {
		   System.out.println("Unlock phone with passcode");
	   }
	   else if (Facial_Unlock!=true)
	   {
		   System.out.println("Unlock phone with facial unlock");
	   }
	else
	{
		System.out.println("Unable to unlock phone");
	}
}

}
