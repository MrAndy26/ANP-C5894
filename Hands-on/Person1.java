package OPPs;
//Thursday lab practical no.2
public class Person1
{
	private String name;
	private int age;
	
//getName Method
	public String getName() {
		return name;
	}

//setName Method
	public void setName(String name) {
		this.name = name;
	}

//getAge Method 
	public int getAge() {
		return age;
	}

//setAge Method
	public void setAge(int age) {
		this.age = age;
	}
}

class Employee extends Person1

{
	private int salary;
	
//getSalary Method
	public int getSalary() {
		return salary;
	}

//setSalary Method
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
class Manager extends Employee
{
	private String department;
	
//getDepartment Method
	public String getDepartment() {
		return department;
	}

	//setDepartment Method
	public void setDepartment(String department) {
		this.department = department;
	}
}
class ManagerMain
{

	public static void main(String[] args)
	{
		//Creating instance of Manager class
		Manager m = new Manager();
		
		//Setting Value
		m.setName("Krishna");
		m.setAge(28);
		m.setSalary(27000);
		m.setDepartment("Software Testing");
		
		//Pringing Value
		System.out.println("Name is:" +m.getName());
		System.out.println("Age is:" + m.getAge());
		System.out.println("Salary is:" + m.getSalary());
		System.out.println("Department is:" + m.getDepartment());

	}

}
