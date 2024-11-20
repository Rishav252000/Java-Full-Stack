package app54;

public class M9a {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			test2();
		}
		catch(ArithmeticException ex) 
		{
			ex.printStackTrace();
			
		}
			System.out.println(3);
		
			System.out.println(4);
	}
	static void test2()
	{
		System.out.println(5);
		int i = 10 / 0;
		System.out.println(6);
	}
}
