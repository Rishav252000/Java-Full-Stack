package practiceSet;

public class M1 {
	private int age;
	
	public String setAge(int age) {
		if(age>=0) {
		this.age = age;
		return "age is set to: " + age;
		}
		return "Invalid age" + age;
	}
	public void  age() {
		System.out.println("Age :" + age);
	}
}
