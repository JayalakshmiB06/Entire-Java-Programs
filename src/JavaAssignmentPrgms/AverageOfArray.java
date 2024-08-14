package JavaAssignmentPrgms;

import java.util.Scanner;

public class AverageOfArray
{
public static void main(String[] args) 
{
	int Marks[] = new int [7];
	Scanner SC = new Scanner(System.in);
	System.out.println("Enter Array Elements");
	int sum=0;
	for(int i =0;i<Marks.length;i++)
	{
		Marks[i] = SC.nextInt(); 
		sum = sum+Marks[i];
	}
System.out.println(sum);
float Average = sum/Marks.length;
System.out.println(Average);
}
}
