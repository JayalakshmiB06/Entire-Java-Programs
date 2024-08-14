package viva;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayList_methods
{
public static void main(String[] args) 
{
 ArrayList<String> ALS = new ArrayList<String>();
 ALS.add("jaya");
 ALS.add("lakshmi");
 ALS.remove(0);
 ALS.clear();
 ALS.add(0, "bogavelly");
 ALS.add(1, "chowdary");
System.out.println(ALS);
System.out.println(ALS.contains("bogavelly"));
System.out.println(ALS.size());
System.out.println(ALS.indexOf("Jaya"));
System.out.println(ALS.indexOf("chowdary"));
System.out.println(ALS.get(1));
ALS.set(0, "Female");
ALS.clear();
System.out.println(ALS);
ArrayList<String> l1 = new ArrayList<String>();
l1.add("Learning");
l1.add(1, "Java");
l1.addAll(ALS);
l1.removeAll(ALS);
System.out.println(l1);
Collections.sort(l1);
System.out.println(l1);
}
}
