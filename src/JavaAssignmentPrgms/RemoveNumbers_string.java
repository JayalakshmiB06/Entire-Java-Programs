package JavaAssignmentPrgms;

import java.util.Arrays;

public class RemoveNumbers_string {
public static void main(String[] args) {
		String s = "Jaya123";
		String r = "School123";
	    System.out.println(s.replaceAll("123",""));
	    System.out.println(s.replaceAll("Jaya",""));
        System.out.println(r.replaceFirst("o", ""));
        System.out.println(s.substring(4));
        System.out.println(r.substring(0, 6));
	}

}
