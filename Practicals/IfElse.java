package LOOPs;
import java.util.*;
public class IfElse 
{
	public static void main(String[] args)
	{
		//Scanner class to take input from user
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a value:");
	
	//integer input from the user
	int a=s.nextInt();
	
	//Condition
	if(a>=18)
	{
		System.out.println("Eligible for voting");
	}
	else
	{
		System.out.println();
	}
	}

}
