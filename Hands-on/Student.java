package OPPs;
//Printing Student Details
class Student
{
	private String name;
	private int rollno;
	private int age;
	private String address;
	
	//getName method
	public String getName() {
		return name;
	}


//setName method
	public void setName(String name) {
		this.name = name;
	}


//getRollno method
	public int getRollno() {
		return rollno;
	}


//setRollno method
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


//getAge method 
	public int getAge() {
		return age;
	}


//setAge method
	public void setAge(int age) {
		this.age = age;
	}


//getAddress method
	public String getAddress() {
		return address;
	}


//setAge method 
	public void setAddress(String address) {
		this.address = address;
	}
}
class details
{

	public static void main(String[] args) 
	{
		//Crearing instance of class Student
		Student a =new Student();
		
		//setting value
		a.setName("Anand Sharma");
		a.setRollno(26);
		a.setAge(23);
		a.setAddress("Vashi gaon");
		
		//Printing Value
		System.out.println("Name is:" + a.getName());
		System.out.println("Rollno is:" + a.getRollno());
		System.out.println("Age is:" + a.getAge());
		System.out.println("address is:" + a.getAddress());
	}
}	
		
		
		
		
		

