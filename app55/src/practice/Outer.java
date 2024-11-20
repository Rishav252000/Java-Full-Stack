package practice;

public class Outer {
	static  int i = 10;
	class A{
		void test() {
			System.out.println("test" + i);
		}
		 void test1() 
		{
			System.out.println("test1" + i);
		}
	}
	public static void main(String[] args) {
		new Outer().new A().test();
	}
}
