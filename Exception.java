import java.io.*;
import java.util.Scanner;
public class Exception
{ 
	public static void main(String args[])
	{
	int a,b,d,n;
	int ar[]=new int[10];
	try
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first number : ");
		a=Integer.parseInt(in.next());
		System.out.println("Enter second number : ");
		b=Integer.parseInt(in.next());
		d=a/b;
		System.out.println("Division = "+d);
		System.out.println("Enter the limt : ");
		n=Integer.parseInt(in.next());
		System.out.println("Enter the numbers : ");
		for(int i=1;i<=n;i++)
		{
			ar[i]=in.nextInt();
		}
		System.out.println("Numbers are : ");
		for(int i=1;i<=n;i++)
		{
			System.out.println(ar[i]);
		}
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("Division by zero not possible");	
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Can't insert at this position..!!Array Index Out Of Bounds Exception");
	}
	catch(NumberFormatException e)
	{
		System.out.println("NumberFormatException");
	}
	}
}