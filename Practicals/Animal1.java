package oops;

public class Animal1 
{
	String name;
	public void eat()
	{
		System.out.println("Animal eats");
		
	}
}
class Dogs extends Animal1
{
	public void sound()
	{
		System.out.println("Dogs barks");
	}
}
class Puppy extends Dogs
{
	public void colour()
	{
		System.out.println("white and black");
	}
}
class Animal1Main
{
	public static void main(String[] args)
	{
		Puppy p= new Puppy();
		p.name="moti";
		System.out.println("Name is " + p.name);
		p.eat();
		p.sound();
		p.colour();
	}
	
}
