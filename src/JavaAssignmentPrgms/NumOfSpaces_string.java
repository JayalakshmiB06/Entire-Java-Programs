package JavaAssignmentPrgms;

public class NumOfSpaces_string {

	public static void main(String[] args) {
		String Input = "My name is Jaya";
		int count = 0;
		for(int i =0;i<Input.length();i++)
		{
			if(Character.isWhitespace(Input.charAt(i)))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
