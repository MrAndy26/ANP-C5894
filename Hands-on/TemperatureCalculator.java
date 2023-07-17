package loops;
/*Prompt the user to enter a temperature in Celsius.
Provide a menu to choose the conversion type: Fahrenheit, Kelvin, or Rankine.
Use a switch case statement to perform the selected conversion and display the result.
Handle invalid conversion choices appropriately.*/

//importing scanner class
import java.util.Scanner;
public class TemperatureCalculator 
{
	public static void main(String[] args) 
	{
		//input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a temperature in celsius: ");
		//input for temperature
		int temperature=sc.nextInt();
		
		System.out.println("Available conversion types are: ");
		System.out.println("1. Fahrenheit");
		System.out.println("2. Kelvin");
		System.out.println("3. Rankine");
		System.out.println("select your conversion type: ");
		
		//declaring variables
		String conversiontype;
		double result;
		int conversion=sc.nextInt();
		
		//switch case
		switch(conversion)
		{
		  case 1:
		  result=(temperature*9/5)+32;
		  conversiontype="Fahrenheit";
		  break;
		  
		  case 2:
		  result=temperature+273.15;
		  conversiontype="Kelvin";
		  break;
			  
		  case 3:
		  result=(temperature + 273.15) * 9 / 5;;
		  conversiontype="Rankine";
		  break;
		  
		  default:
		  System.out.println("Handle invalid conversion choices appropriately ");
		  return;
		}
		
		System.out.println("The converted temperature in " +conversiontype+ ":" +result);
        sc.close();
	}

}
