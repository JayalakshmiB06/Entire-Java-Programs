package viva;

import java.util.Scanner;

public class palindrome_prgm {

	public static void main(String[] args) {
		String rev ="";
		String palindrome;
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the input string");
		palindrome=SC.next();
		for(int i = palindrome.length()-1;i>=0;i--)
		{
			rev = rev+palindrome.charAt(i);
		}
		if(palindrome.equals(rev))
		{
			System.out.println("yes it is a plaindrome");
		}
		else
		{
			System.out.println("yes it is not a plaindrome");
		}
	}

}
