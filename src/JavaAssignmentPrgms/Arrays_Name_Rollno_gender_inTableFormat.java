package JavaAssignmentPrgms;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays_Name_Rollno_gender_inTableFormat 
{
public static void main(String[] args) 
{
String[] Student_Names = new String[3];
int[] Rollno = new int[3];
String[] Gender = new String[3];
Scanner s1 = new Scanner(System.in);

   for(int i =0; i<3;i++)
   {  
	  System.out.println("Enter student details  " +i);
	  Student_Names[i]=s1.next();
	  Rollno[i]=s1.nextInt();
	  Gender[i]=s1.next();
   }
	 System.out.println("Student_Names"+ "     "+"Rollno"+"      "+"Gender");
	 for(int j= 0;j<3;j++)
	 {
		 System.out.println(Student_Names[j] +"               "+ Rollno[j]+"             " +Gender[j]);
	 }
   }
  
}

