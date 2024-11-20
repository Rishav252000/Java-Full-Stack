package app57;
class Job {
	String title;  
	double salary;
}
class Employee{
	String name;
	Job[] jobs;
	private int index;
	Employee(String name, Job[] jobs){
		this.name = name;
		this.jobs = jobs;
	}
	boolean hasNext() {
		return index < jobs.length;
	}
	Job nextJob(){
		return jobs[index ++];
	}
	public void setIndex(int val)
	{
		index=val;
	}
	
}
public class M1 {
	public static void main(String[] args) {
		Job j1 = new Job(); 
		j1.title = "software";
		j1.salary = 450000.0;
		
		Job j2 = new Job();
		j2.title = "sales";
		j2.salary = 25000.0;
		
		Job j3 = new Job();
		j3.title = "hr";
		j3.salary = 51000.0;
		
		Job[] jobs = {j1, j2, j3};
		
		Employee emp = new Employee("ramu", jobs);
		while(emp.hasNext()) {
			Job obj = emp.nextJob();
			System.out.println(emp.name +" "+ obj.title + ", " + obj.salary);
			System.out.println("---------");
		}
		emp.setIndex(0);
		while(emp.hasNext()) {
			Job obj = emp.nextJob();
			System.out.println(obj.title + ", " + obj.salary);
			System.out.println("---------");
			
		}
	}
}
