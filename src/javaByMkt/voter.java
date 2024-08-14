package javaByMkt;
import java.util.Scanner;
public class voter {

	public static void main(String[] args) {
		Scanner	 SC = new Scanner(System.in);
		System.out.println("Enter your gender");
		String G = SC.next();
		System.out.println("Enter your age");
	     int a = SC.nextInt();
	     if(a>=18 && G.equals("Female")) 
	     {
			 System.out.println("Eligible to vote");
		}
	     else
	     {
	    	 System.out.println("not Eligible to vote"); 
	     }
	     
	   
	}
}
