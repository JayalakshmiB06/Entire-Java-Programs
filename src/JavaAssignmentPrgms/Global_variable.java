//prgm to add,sub,div,mul using global variable

package JavaAssignmentPrgms;

import java.util.Scanner;

public class Global_variable 
{
Scanner SC = new Scanner(System.in);
int GlobalV1 = SC.nextInt();
int GlobalV2 = SC.nextInt();
public static void main(String[] args)
{
	Global_variable  A = new Global_variable  ();
	System.out.println(A.GlobalV1+A.GlobalV2);
	System.out.println(A.GlobalV1-A.GlobalV2);
	System.out.println(A.GlobalV1*A.GlobalV2);
	System.out.println(A.GlobalV1/A.GlobalV2);
	System.out.println(A.GlobalV1%A.GlobalV2);
}
}
