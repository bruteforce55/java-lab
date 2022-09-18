import java.util.*;
class method_ovr
{	
	int first,last,sum=0;
	public int sum(int a)
	{
		last=a;
		first=0;
 		for(int i=first;i<=last;i++)
     	{
			sum=sum+i;
    	 }
		return sum;
	}
	public int sum(int a,int b)
		{
		first=a;
		last=b;
		for(int i=first;i<=last;i++)
		{
			sum=sum+i;
		}
	   return sum;
	}
}
class overload extends method_ovr
{
	public static void main(String args[])
	{	
		overload over=new overload();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the limit for sum :");
		int n=s.nextInt();
		int sum1=over.sum(n);
		System.out.print("Sum of numbers ::"+sum1+"\n");
 		System.out.print("Enter the first and last limit for sum :\n");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int sum2=over.sum(n1,n2);
		System.out.print("Sum of numbers ::"+sum2);
	}

}