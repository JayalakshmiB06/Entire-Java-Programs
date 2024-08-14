package JavaAssignmentPrgms;
import java.util.Arrays;
import java.util.Scanner;
public class equals_Array 
{

	public static void main(String[] args) 
	{   
		String[] Names1 = new String [4];
		String[] Names2 = new String [4];
		Scanner sc = new Scanner(System.in);
	
		if(Names1.length == Names2.length)
		{   
			System.out.println("Eneter inputs in array1");
			for(int i =0; i<4;i++)
			{  
				Names1[i] = sc.next();
			}
			System.out.println("Eneter inputs in array2");
			for(int i =0; i<4;i++)
			{
				Names2[i] = sc.next();
			}	
			}
			System.out.println(Arrays.equals(Names1, Names2));
		}

	}


