package loops;
/*
A simple calculator example.
It prompts the user to enter two numbers and 
choose an operation to perform on those numbers.
*/

//importing scanner class
import java.util.Scanner;
public class Calculator 
{

	public static void main(String[] args) 
	{
		////input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Calculator App: ");
		System.out.println("---------------------------");
		
		System.out.println("Enter the first number: ");
		 //for 1st number
		double num1=sc.nextDouble();
		
		
		System.out.println("Enter the second number:");
		//for 2nd number
		double num2=sc.nextDouble();
		
		System.out.println("Available operation is: ");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter your operation: ");
		
		//input for operation
		int operation=sc.nextInt();
		
		//variable declaration
		double result;
		
		//switch case
		switch(operation)
		{
		   case 1:
			result=num1+num2;
			System.out.println("The result of addition is: "+result);
			break;
			
		   case 2:
		   result=num1-num2;
		   System.out.println("The result of substraction is :"+result);
		   break;
		   
		   case 3:
		   result=num1*num2;
		   System.out.println("The result of multiplication is:"+result);
		   break;
		   
		   case 4:
		   if(num2!=0)
		   {
			   result=num1/num2;
			   System.out.println("The result of division is: "+result);
		   }
		   else
		   {
			   System.out.println("Error: Division by zero is not allowed.");
		   }
		   break;
		   
		   default:
		   System.out.println("Error: Invalid operation number.");
		   break;
		}
		sc.close();
	}

}
