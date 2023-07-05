 package oops;
//example of multilevel inheritance
public class Animal1 
{
	//fields and methods
	String name;
	public void eat()
	{
		System.out.println("Animal eats");
		
	}

}
//inherits from class Animal1
class Dogs extends Animal1
{
	//fields and methods of Animal1 class
	//fields and methods of dogs class
	public void sound()
	{
		System.out.println("Dogs barks");
	}
}
class Puppy extends Dogs
{
	//fields and methods of Animal1 class
	//fields and methods of dogs class
	//fields and methods of Puppy class
	public void colour()
	{
		System.out.println("white and black");
	}
}
class Animal1Main
{
	public static void main(String[] args)
	{
		//creating object of subclass
		Puppy p= new Puppy();
		//access fields and methods
		p.name="moti";
		System.out.println("Name is " + p.name);
		p.eat();
		p.sound();
		p.colour();
	}
	
}
