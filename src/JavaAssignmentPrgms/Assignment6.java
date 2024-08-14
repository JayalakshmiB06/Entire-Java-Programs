//else if prgm to print ticket cost based on value passed

package JavaAssignmentPrgms;
import java.util.Scanner;
public class Assignment6 
 {
    public static void main(String[] args)
	{
	Scanner S = new Scanner(System.in);
	System.out.println("Enter the Amount you have");
	int Amount = S.nextInt();
	
	if(Amount<100) 
	{
		System.out.println("Print Ticket");
	}
	
	else
	{
		System.out.println("Don't Print Ticket");
	}

} 
 }
