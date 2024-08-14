package JavaAssignmentPrgms;

import java.util.Date;

public class Date_prgm 
{
public static void main(String[] args) 
{   
	Date date = new Date();
	Date currentdate = new Date(date.getTime());
	System.out.println(currentdate);
	
	
	Date pastdate= new Date(date.getTime()-(60*60*1000*24));
	System.out.println(pastdate);
	Date futuredate = new Date(date.getTime()+(60*60*1000*24));
	System.out.println(futuredate);

}
}
