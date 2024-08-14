package viva;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysEqual_prgm {

	public static void main(String[] args) {
		String [] names = new String[2];
		String [] names1 = new String[2];
		Scanner SC =  new Scanner(System.in);
		System.out.println("Eneter array 1 elements");
		for(int i=0;i<names.length;i++)
		{
			names[i] = SC.next();
		}
		System.out.println("Eneter array two elements");
for(int j=0;j<names1.length;j++)
{
	names1[j] = SC.next();
}
if(Arrays.equals(names, names1))
{
	System.out.println("two arrays are equal");
	}
else
{
	System.out.println("two arrays are not equal");
	}
	}

}
