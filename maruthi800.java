import java.io.*;
class car
{
public void vehicleType()
  {
	System.out.print("Vehicle Type : car");
  }
}
class maruthi extends car
{
	public void brand()
	{	
	System.out.print("\n Brand : Maruthi");	
	}
}
public class maruthi800 extends maruthi
{
	public void speed()
	{
		System.out.print("\n Speed : 90kmph");
	}
 public static void main(String args[])
	{
		maruthi800 s=new maruthi800();
		s.vehicleType();
		s.brand();
		s.speed();

	}
}