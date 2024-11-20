package app59;
class Person{
	String firstName;
	String lastName;
	int age;
	double weight;
	
	public Person(String s1, String s2, int i, double w){
		this.age = i;
		this.firstName = s1;
		this.lastName = s2;
		this.weight = w;
	}
	//develop all 3 method
	@Override
	public String toString() {
		
		return "firstName: " + firstName +"\n"+ "lastName: " + lastName;
	}
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Person) &&
		(firstName == ((Person) obj).firstName) &&
		(lastName == ((Person) obj).lastName) &&
		(weight == ((Person) obj).weight);
		}
		

	@Override
	public int hashCode() {
		String str1 = Integer.toString(age);
		String str2 = Double.toString(weight);
		int hash = str1.hashCode();
		hash += str2.hashCode();
		hash += firstName.hashCode();
		hash += lastName.hashCode();
		return hash;
	}
}
public class M11 {
	public static void main(String[] args) {
		// develop person object and check overrided methods
		Person obj1 = new Person("Ram", "Kumar", 25, 85.2);
		Person obj2 = new Person("Ram", "Kumar", 25, 85.2);
		System.out.println(obj1);
		System.out.println(obj2);
		
		Person obj3 = new Person("Ramesh", "Kumar", 35, 50.2);
		
		System.out.println("obj1 equals obj2 " +obj1.equals(obj2));		
		System.out.println("obj1 equals obj3 " +obj1.equals(obj3));		
		System.out.println("obj2 equals obj3 " + obj2.equals(obj3));		

		System.out.println("obj1 hashcode return int value = "+obj1.hashCode());		
		System.out.println("obj2 hashcode return int value = "+obj2.hashCode());		
		System.out.println("obj3 hashcode return int value = "+obj3.hashCode());		
		
	}
}
