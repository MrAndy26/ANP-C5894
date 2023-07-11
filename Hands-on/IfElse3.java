package LOOPs;
import java.util.*;
public class IfElse3
{

	public static void main(String[] args) 
	{
		// Scanner class to take as input
		Scanner c = new Scanner(System.in);
		System.out.println("Enter Year:");
		
		//integer input from the user
		int a=c.nextInt();
		
		//condition
		if (a%4==0)
		{
			System.out.println("Year is Leap Year");
		}
		else if  (a%100==0)
		
		{
		System.out.println("Year is Leap Year");
		}
		else if (a%400==0)
		{
			System.out.println("Year is Leap Year");
		}
		else
		{
			System.out.println("Year is not Leap Year");
		}
	}

}
