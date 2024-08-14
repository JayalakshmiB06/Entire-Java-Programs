package JavaAssignmentPrgms;
import java.util.Arrays;
import java.util.Scanner;
public class HowToTakeInput_Array 
{
public static void main(String[] args) 
{
		
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int i=	SC.nextInt();
		String[] Name = new String [i];
		for(int j=0;j<i;j++) 
		{
		  System.out.println("Enter the String at index   " +j);
		  Name[j]=SC.next();
			
		}
		System.out.println(Arrays.toString(Name));
}

}
