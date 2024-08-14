package JavaAssignmentPrgms;

public class Only_digits_string {

	public static boolean InputString()
	{
		String str = "Jaya9705696242";
		
		for(int i = 0;i<=str.length()-1;i++)
		{
		if(!Character.isDigit(str.charAt(i)))
		{
		return false;	    
		}
		}
	    return true;
		}
		
	
		public static void main(String[] args)
		{
			System.out.println(InputString());
			
		}
}

