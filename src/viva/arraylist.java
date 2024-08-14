package viva;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class arraylist
{
public static void main(String[] args)
{
	List<String> List =  new ArrayList<String>();	
    List.add("core");
	List.add("java");
	List.add("viva");
	Iterator<String> i = List.listIterator();
	System.out.println(i.next());
	
	System.out.println(i.hasNext());
	System.out.println(i.next());
	System.out.println(i.hasNext());
	System.out.println(i.next());
	System.out.println(i.hasNext());
}

}
