package OPPs;
// example of Vehicles Attributes
public class Vehicle 
{
	public String brands;
	public int years;
	public void displayinfo()
	{
		System.out.println("Brand & year of the vehicle");
	}
}

class Car extends Vehicle
 {
	String model;
 }
class SportsCar extends Car
{
	public String topSpeed;
	public void displayinfo()
	
	{
		System.out.println("Brand,year,model & topSpeed");
	}
}
class VehicleMain
{	
	public static void main(String[] args)
	{
		 SportsCar s = new SportsCar();
		 s.brands=("Toyota");
		 s.years=(2019);
		 s.model=("Supra");
		 s.topSpeed=("225kmps");
		 System.out.println("Brand Name is:" +s.brands);
		 System.out.println("Model Name is:" +s.model);
		 System.out.println("Year is:" +s.years);
		 System.out.println("TopSpeed is:" +s.topSpeed);
	}

}
