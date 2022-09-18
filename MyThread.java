import java.util.logging.Level;
import java.util.logging.Logger;
class Hi extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
       			 {
				System.out.println("Hi");
  				 try
           				 {
					Thread.sleep(1000);
            			                     }
            				catch (InterruptedException ex)
           				 {
					Logger.getLogger(Hi.class.getName()).log(Level.SEVERE,null,ex);

            				 }
       			 }
  	}
}
class Hello extends Thread
{
    public void run()
             {
	for(int i=1;i<=5;i++)
        	{
	            System.out.println("Hello");
            	             try
	            {
		Thread.sleep(1000);
            	            }
                               catch (InterruptedException ex)
          	          {
                		 Logger.getLogger(Hello.class.getName()).log(Level.SEVERE,null,ex);
            	          }
        	}
         }
}
public class MyThread
{
    public static void main(String[] args) throws InterruptedException
    {
        Hi obj1=new Hi();
        Hello obj2=new Hello();
        obj1.start();
        Thread.sleep(500);
        obj2.start();
    }
}