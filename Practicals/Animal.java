package OPPs;
//Example of Inheritance
//super class or base class or parent class
class Animal 
{
	//field & methods
	String name;
	public void eat()
	{
		System.out.println("Animal eat...");
		
	}
}
//inherit from Animal
class Dog extends Animal
{
	//fields & methods of Animal class
	//fields & methods of Dog class
	public void sound()
	{
		System.out.println("Dog Barks...");
	}
}

class AnimalMain
{
	public static void main(String[] args)
	{
	//Creating object of sub class
	Dog d =new Dog();
			//Access fields & methods
			d.name="Moti";
	System.out.println("Name is:" + d.name);
	d.eat();
	d.sound();
	
	}
}	


