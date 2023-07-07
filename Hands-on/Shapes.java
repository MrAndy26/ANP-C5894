package OPPs;
//Example of abstraction
abstract class Shapes 
{
	//Contains abstract method
	//Abstract method does not have body
public abstract void calculateArea ();
public abstract void calculatePerimeter();
}

//Creating Subclass of Rectangle
class Rectangles extends Shapes
{
	//can contain non abstract method
	public void calculateArea()
	{
		System.out.println("Area of Rectangles is A=l*w");
	}
	public void calculatePerimeter()
	{
		System.out.println("Perimeter of Rectangles is A=2(l+w)");
	}
}

//Creating SubClass of Circle
class Circle extends Shapes
{
	//can contain non abstract method
	public void calculateArea()
	{
		System.out.println("Area of circle is : A = π r²");
	}
	public void calculatePerimeter()
	{
		System.out.println("Perimeter of circle is : 2πR");
	}
}

//Creating SubClass of Circle
class Triangle extends Shapes
{
	//can contain non abstract method
	public void calculateArea()
	{
		System.out.println("Area of Triangle is :  A = ½ (b × h) square units");
	}
	public void calculatePerimeter()
	{
		System.out.println("Perimeter of triangle is : a + b +c ");
	}
}

//Creating Main class
class ShapesMain
{
	public static void main(String[] args)
	{
		//Creating instance of Rectangle class
		Rectangles r = new Rectangles();
		//Accessing Methods
		r.calculateArea();
		r.calculatePerimeter();
		
		//Creating instance of Circle class
		Circle c = new Circle();
		//Accessing Methods
		c.calculateArea();
		c.calculatePerimeter();
		
		//Creating instance of Triangle class
		Triangle t = new Triangle();
		//Accessing Methods
		t.calculateArea();
		t.calculatePerimeter();

	}

}
