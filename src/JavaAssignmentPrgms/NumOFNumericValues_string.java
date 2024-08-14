package JavaAssignmentPrgms;

public class NumOFNumericValues_string {

	public static void main(String[] args) {
		String input = "Jaya12345";
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			if(Character.isDigit(input.charAt(i)))
			{
				count++;
			}
		}
System.out.println(count);
	}

}
