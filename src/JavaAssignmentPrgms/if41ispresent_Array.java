package JavaAssignmentPrgms;

import java.util.Scanner;

public class if41ispresent_Array {

public static void main(String[] args) {
	int count =0;
		int[] Num	= new int[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter inputs to array");
		for(int i =0;i<Num.length;i++)
		{
			Num[i]=sc.nextInt();
		
			if(Num[i] ==41)
			{
				System.out.println("41 is present in given array");
				count++;
			}	
			}
			System.out.println("41 is present in given array"+" " +count + " "+"times");
		   
		
		
}

}
