package LOOPs;

import java.util.Scanner;

public class IfElse2 {

	public static void main(String[] args)
	{
		//Scanner class to take input from user
	Scanner c = new Scanner(System.in);
	System.out.println("Enter a value:");
	
	//integer input from the user
	int b=c.nextInt();
	
	//Condition
	if((b%5==0) && (b%11==0))
	{
		System.out.println("Divisible");
	}
	else
	{
		System.out.println("Not Divisible");
	}
	}

}