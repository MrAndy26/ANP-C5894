package OPPs;
//Example of Multilevel Inheritance
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
class Puppy extends Dog
{
	//fields & methods of Animal class
	//fields & methods of Dog class
	//fields & methods of Puppy class
	public void colour()
	{
		System.out.println("Black & White");
	}
}

class PuppyMain
{
	public static void main(String[] args)
	{
	//Creating object of sub class
	Puppy p =new Puppy();
	
		//Access fields & methods
		p.name="moti";
	System.out.println("Name is:" +p.name );
	p.eat();
	p.colour();
	p.sound();
		
	}
}


