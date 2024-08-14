package javaByMkt;

public class String_Buffer 
{
public static void main(String[] args) 
  {
	
	StringBuffer buffer = new 	StringBuffer(15);
	buffer.append("Jaya");
	buffer.append(1);
	//buffer.reverse();
	System.out.println(buffer);
	System.out.println(buffer.capacity());
	System.out.println(buffer.length());
	System.out.println(buffer.charAt(4));
	System.out.println(buffer.replace(0, 4, "Lakshmi"));
	System.out.println(buffer.deleteCharAt(buffer.length()-1));
	buffer.ensureCapacity(30);
	System.out.println(buffer.capacity());
	buffer.setLength(15);
	
  }

}

