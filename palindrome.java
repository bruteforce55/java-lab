import java.io.*;
import java.util.*;
class palindrome
{
	public static void main(String args[])
	{
		int num,rev=0,n,rem;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a number");
    	n=s.nextInt();
 		num=n;
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(rev==num)
		{
			System.out.print("The number is palindrome");
		}
		else
		{
			System.out.print("The number is not palindrome");
		}
	}
}