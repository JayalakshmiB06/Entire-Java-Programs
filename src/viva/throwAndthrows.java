package viva;

public class throwAndthrows 
{
public static void main(String[] args) throws ArithmeticException
{   int num =10;
	for(int i=0;i<=num;i++)
	{
		System.out.println(i%1==0);
	}
throw new ArithmeticException();
}
}
