package app54;
class A
{
	static int i = 12;
	A()
	{
		System.out.println(1);
	}
	A(Integer a1)
	{
		System.out.println(2);
	}
}
class B extends A
{
	
}
public class M4a extends A{
	
	public static void main(String[] args) {
		String s1 = "abc";
		int j = 0;
		A a1 = new M4a();
		B b1 = new B();
		try
		{
			M4a m1 = (M4a) a1;
			int d1 = i / j;
			System.out.println(d1);
			Integer obj = Integer.valueOf(s1);
		}
		catch(ClassCastException  | NumberFormatException | ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Complete Handling");
			
		}
	}
}
