abstract class Employee
{
	abstract void work();
	//several other members
}

class HREmployee extends Employee
{
	void work()
	{
		System.out.println("HR-Work");
	}
}
class SoftwareEmployee extends Employee
{
	void work()
	{
		System.out.println("Software-Work");
	}
}

class M3 
{
	public static void main(String[] args) 
	{
		Employee e1 = new HREmployee();
		Employee e2 = new SoftwareEmployee();
		Employee[] employees = {e1, e2};
		for(Employee employee : employees)
		{
			employee.work();
		}
	}
}
