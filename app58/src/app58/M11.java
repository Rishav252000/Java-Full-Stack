 package app58;

class Employee {
	
}
class PermanentEmployee extends Employee
{
	
}
class ContractEmployee extends Employee
{
	
}

class SalesEmployee extends Employee
{
	
}
class MarketEmployee extends SalesEmployee
{
	
}

class Q<A extends Employee> {
	A f1;
	
}
public class M11 {
	public static void main(String[] args) {
		Q<Employee> q1 = new Q<Employee>();
		
		q1.f1 = new Employee();
		
		Q<PermanentEmployee> q2 = new Q<PermanentEmployee>();
		q2.f1 = new PermanentEmployee();
		
		Q<ContractEmployee> q3 = new Q<ContractEmployee>();
		q3.f1 = new ContractEmployee();
		
		Q<SalesEmployee> q4 = new Q<SalesEmployee>();
		q4.f1 = new SalesEmployee();
		
		Q<MarketEmployee> q5 = new Q<MarketEmployee>();
		q5.f1 = new MarketEmployee();
		
		
		
	}
}
