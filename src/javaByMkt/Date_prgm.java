package javaByMkt;

import java.util.Date;

public class Date_prgm 
{

	public static void main(String[] args) 
	{
		Date date = new Date();
		Date current_date =new Date(date.getTime());
		System.out.println(current_date);
		
		Date past_date = new Date(date.getTime()-(60*60*1000*24*3));
		System.out.println(past_date);
		
		Date future_date = new Date(date.getTime()+(60*60*1000*24*3));
		System.out.println(future_date);
	}

}
