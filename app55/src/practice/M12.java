package practice;

public class M12 {
	
	class A{
		void test1() 
		{
			System.out.println("ab");
		}
		static void test() 
		{
			System.out.println("done");
		}
	}
	public static void main(String[] args) {
		M12 m = new M12();
		M12.A a1 = m.new A();
		a1.test();
	}
}
