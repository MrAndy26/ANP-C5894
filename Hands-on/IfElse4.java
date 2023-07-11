package LOOPs;
import java.util.*;
public class IfElse4
{

	public static void main(String[] args) 
	{
		//Scanner class to take input 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		
		//integer input from user
		int a=s.nextInt();
		
		//Condition
		if((a%2==00) && (a%3==0))
		{
			System.out.println("It is Divisible by 2 & 3");
		}
		else if (a%3==0)
		System.out.println("It is Divisible by 3");
		else if (a%2==00)
		{
			System.out.println("It is Divisible by 2 ");
		}
		else 
		{
			System.out.println("It is npot Divisible by 2 & 3 or both");
		}
		}

	}


