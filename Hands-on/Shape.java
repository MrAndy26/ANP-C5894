package OPPs;
// example of Shape 
class Shape
{
	//Methods
	public void calculateArea()
	{
		System.out.println("Calculating area of the shape");
	}
}


class Rectangle extends Shape

{
	@Override
	public void calculateArea()
	{
		System.out.println("area of the Rectangle ");
	}
	
}
class ShapeMain
{
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle();
		r.calculateArea();
	}
}


