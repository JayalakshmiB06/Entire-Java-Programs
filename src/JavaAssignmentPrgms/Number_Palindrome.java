package JavaAssignmentPrgms;

import java.util.Scanner;

public class Number_Palindrome {

	public static void main(String[] args) {
		Scanner Sc = new Scanner (System.in);
		System.out.println("Enter the num");
		int Original = Sc.nextInt();
		int reverse =0;
		while(Original>0)
		{
			reverse = (reverse*10)+Original%10;
			Original=Original/10;
		}
		System.out.println(reverse);
		if(Original==reverse)
		{
			System.out.println("Given number is palindrome");
		}
		else
		{
			System.out.println("Given number is not palindrome");
		}
}
}
