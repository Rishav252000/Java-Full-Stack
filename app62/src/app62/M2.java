package app62;
class B{
	static 
	{
		System.out.println("B-SIB");
		test();
	}
	
	static void test() {
		System.out.println("Static method");
	}
}
public class M2 {
	public static void main(String[] args) {
		try {
			Class c1 = Class.forName("app62.B");
		}
		catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
