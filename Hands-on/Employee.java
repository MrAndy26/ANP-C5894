package OPPs;
//printing Employee Details
public class Employee 
{
	
	private String Name;
	private int Employeeid;
	private int Salary;
	private int Incentive;
	private int Age;
	
	//getName method
	public String getName() {
		return Name;
	}
	
	//setName method
	public void setName(String name) {
		Name = name;
	}
	
	//getEmployee id method
	public int getEmployeeid() {
		return Employeeid;
	}
	
	//setEmployee id method
	public void setEmployeeid(int employeeid) {
		Employeeid = employeeid;
	}
	
	//getSalary method
	public int getSalary() {
		return Salary;
	}
	
	//setSalary method
	public void setSalary(int salary) {
		Salary = salary;
	}
	//getIncentive method
	public int getIncentive() {
		return Incentive;
	}
	
	//setIncentive method
	public void setIncentive(int incentive) {
		Incentive = incentive;
	}
	
	//getAge method
	public int getAge() {
		return Age;
	}
	
	//setAge method
	public void setAge(int age) {
		Age = age;
	}
	
}

class employ
{
	public static void main(String[] args)
	{
		
		//Creating instance of class Employee
		Employee p =new Employee();
		
		//Setting Value
		p.setName("Rakesh roy");
		p.setAge(25);
		p.setEmployeeid(1225);
		p.setIncentive(2500);
		p.setSalary(25000);
		
		//Printing Value
		System.out.println("Name is:" +p.getName());
		System.out.println("Age is:" +p.getAge());
		System.out.println("Employee is:" +p.getEmployeeid());
		System.out.println("Incentive is:" +p.getIncentive());
		System.out.println("Salary is:" +p.getSalary());
	}
}
