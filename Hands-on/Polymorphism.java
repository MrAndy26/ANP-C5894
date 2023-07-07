package OPPs;
//Example of Polymorphism

public class Polymorphism 
{
	// 1.Method Overloading/Compiletime polymorphism
	//same method name with different parameters & return type.
			
		public int mul(int a,int b) 
		{
			return a*b;
		}
		public int mul(int a,int b,int c) 
		{
			return a*b*c;
		}
		public double mul(double a,double b) 
		{
			return a*b;
		}
	}
//Creating Main class
	class PolymorphismMain
	{
		public static void main(String[] args)
		{
			//Printing value
			Polymorphism p=new Polymorphism();
			System.out.println("The mul is :" + p.mul(10,10));
			System.out.println("The mul is :" + p.mul(51,95,0));
			System.out.println("The mul is :" + p.mul(20.50,10.60));
		}
	}