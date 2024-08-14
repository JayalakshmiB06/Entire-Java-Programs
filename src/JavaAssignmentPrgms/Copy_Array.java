package JavaAssignmentPrgms;

import java.util.Scanner;

public class Copy_Array {

public static void main(String[] args) {
		String [] Names1 = new String[4];
		String [] Names2 = new String[4];
        Scanner SC = new Scanner(System.in);
        System.out.println("Eneter Names1 values");
        for(int i=0;i<Names1.length;i++)
        {
        	Names1[i]=SC.next();
        }
        Names2 = Names1.clone();
        for (int i=0;i<Names1.length;i++)
        {
         System.out.println(Names2[i]);
        }
        System.out.println("------------------------");
        for (int i=Names1.length-1;i>=0;i--)
        {
         System.out.println(Names2[i]);
        }
	}

}
