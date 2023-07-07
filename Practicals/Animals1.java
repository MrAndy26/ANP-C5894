package OPPs;
//Example of abstraction
abstract class Animals1
{
//Contains abstract method
	//Abstract method does not have body
	public abstract void sound();
	//can contain non abstract method
	public void sleep()
	{
		System.out.println("Animal Sleep....");
	}
}
//subclass inherits Animals1
class Monkey extends Animals1
{
	public void sound()
	{
		System.out.println("Monkey sounds like human.....");
	}
}
class Animals1Main
{
	public static void main(String[] args)
	{
		//Creating instance of Monkey class
		Monkey m = new Monkey();
		
		//Accessing Methods
		m.sound();
		m.sleep();

	}

}
