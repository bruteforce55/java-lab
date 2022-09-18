	import java.util.*;
import java.io.*;
public class matrix
{
 public static void main(String args[])
  {
	int n;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the base of squared matrix ");
	n=in.nextInt();
	int a[][]=new int[n][n];
    int b[][]=new int[n][n];
    int c[][]=new int[n][n];
	System.out.println("Enter the elements of 1st matrix");
	for(int i=0;i<n;i++)
      {
 	 for(int j=0;j<n;j++)  
        {
       		a[i][j]=in.nextInt();
		}
      }
  	System.out.println("Enter the elements of 2nd matrix");
	for(int i=0;i<n;i++)
      {
 	 for(int j=0;j<n;j++)  
        {
       		b[i][j]=in.nextInt();
		}
	  }
	System.out.println("matrix after multiplication ");
	for(int i=0;i<n;i++)
      {
 	 for(int j=0;j<n;j++)  
        {
 		for(int k=0;k<n;k++)
			{
       		c[i][j]=c[i][j]+a[i][k]*b[k][j];
		    }
		}
	  }
   System.out.println("Product is");
   for(int i=0;i<n;i++)
      {
 	 for(int j=0;j<n;j++)  
        {
		System.out.println(c[i][j]+" ");

		}
System.out.println();
	  }
}
}
