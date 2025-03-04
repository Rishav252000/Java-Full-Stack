package ObjectClass;
class EmployeeDetails{
	public String firstName;
	public String lastName;
	public int age;
	public double weight;
	public double salary;
	
	
	public EmployeeDetails(String firstName ,String lastName  , int age , double weight, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.weight = weight;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		
		return "First Name: " + firstName + ", Last Name: " + lastName + 
	               ", Age: " + age + ", Weight: " + weight + 
	               ", Salary: " + salary;
	}
	
	@Override
	public int hashCode() {
		String s1 = Integer.toString(age);
		String s2 = Double.toString(weight);
		String s3 = Double.toString(salary);
		int hash = s1.hashCode();
		hash+= s2.hashCode();
		hash+= s3.hashCode();
		
		return hash;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return ((obj instanceof EmployeeDetails) &&
				firstName ==((EmployeeDetails) obj).firstName &&
				lastName ==((EmployeeDetails) obj).lastName &&
				age ==((EmployeeDetails) obj).age &&
				salary ==((EmployeeDetails) obj).salary &&
				weight ==((EmployeeDetails) obj).weight );
	}
	
}
public class Job {
	public static void main(String[] args) {
		EmployeeDetails emp1 = new EmployeeDetails("Rishav" ,"Rajput" , 23, 83.54, 25000.77);
		EmployeeDetails emp2 = new EmployeeDetails("Rishav" ,"Rajput" , 23, 83.54, 25000.77);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println("eqals method: "+emp1.equals(emp2));
		System.out.println("hashcode method(emp1): "+emp1.hashCode());
		System.out.println("hashcode method(emp2): "+emp2.hashCode());
	}
}


