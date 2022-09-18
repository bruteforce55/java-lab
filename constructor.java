class constructor
{
 String name;
 int age;
 constructor()
  {
   System.out.println("Calling default constructor");
  }
 constructor(String name, int age)
 {
 System.out.println("Calling parameterized constructor");
 System.out.println("Name : "+name+ "\n Age : "+age);
 }
 public static void main(String args[])
  {
   constructor ob1=new constructor();
   constructor ob2=new constructor("Arun",20);
  }
}
