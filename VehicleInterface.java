import java.io.*;
interface Vehicle
{
    void speedUp(int a);
    void applyBrakes(int a);
}
class Bicycle implements Vehicle
{
    int speed;
     int gear;
public void speedUp(int increment)
{
speed=speed+increment;
}
public void applyBrakes(int decrement)
{
    speed=speed-decrement;    
}
public void printStates()
{
    System.out.println("Bicycle speed : "+speed);
}
}
class Bike implements Vehicle
{
    int speed;
    int gear;
    public void speedUp(int increment)
    {
        speed=speed+increment;
    }
    public void applyBrakes(int decrement)
    {
        speed=speed-decrement;        
    }
    public void printStates()
    {
        System.out.println("Bike speed : "+speed);      
    }
}
class VehicleInterface
{
             public static void main(String args[])
             {
                    Bicycle bicycle=new Bicycle();
	bicycle.speedUp(3);
	bicycle.applyBrakes(1);
	bicycle.printStates();

	Bike bike=new Bike();
	bike.speedUp(4);
	bike.applyBrakes(3);
	bike.printStates();
             }
}