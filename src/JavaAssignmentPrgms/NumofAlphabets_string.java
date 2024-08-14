package JavaAssignmentPrgms;

public class NumofAlphabets_string {
public static void main(String[] args) {
String Input_string = "Jayalakshmis123";
int count =0;
for(int i =0;i<Input_string.length();i++)
    {
	if(Character.isAlphabetic((Input_string.charAt(i))))
	{
		count++;
	}
	}
System.out.println(count);
}

}
