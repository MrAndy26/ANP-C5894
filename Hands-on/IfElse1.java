package LOOPs;

import java.util.Scanner;

public class IfElse1 {

	public static void main(String[] args)
	{
		//Scanner class to take input from user
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a value:");
	
	//integer input from the user
	int a=s.nextInt();
	
	//Condition
	if(a>0)
	{
		System.out.println("Positive");
	}
	else if(a<0)
	{
		System.out.println("Negative");
	}
	else
	{
		System.out.println("Number is 0");
	}
	}

}
