package OPPs;
//Thursday lab practical No. 1

public class Person 
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
class PersonMain
{

	public static void main(String[] args) 
	{
		//Create a instance of Person class
		Person p =new Person();
		
		//Setting  the Value		
				p.setName("Andy");
		        p.setAge(23);
		        
		        //Printing the Value        
		        System.out.println("Name is:" +p.getName());
		        System.out.println("Age is:" +p.getAge());

	}

}
