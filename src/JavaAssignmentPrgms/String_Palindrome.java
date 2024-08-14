package JavaAssignmentPrgms;

import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String Ogr = Sc.next();
		String reverse ="";
		for(int i = Ogr.length()-1;i>=0;i--)
		{
			reverse = reverse+Ogr.charAt(i);
		}
		System.out.println(reverse);
		if(Ogr.toLowerCase().equals(reverse.toLowerCase()))
		{
			System.out.println("Given word is palindrome");
		}
		else
		{
			System.out.println("Given word is not palindrome");
		} 
		

	}

}
