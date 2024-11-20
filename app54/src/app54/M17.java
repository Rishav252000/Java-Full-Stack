package app54;

public class M17 {
	public static void main(String[] args) {
		System.out.println(1);
		if(false)
		{
			return;
		}
		try
		{
			System.out.println(111);
			int i = 10 / 0;
		}
		catch(ArithmeticException ex)
		{
			System.out.println(222);
			int i = 10 / 0;
		}
		finally
		{
			System.out.println(555);
		}
		System.out.println(12345);
		System.out.println(12345);
		System.out.println(12345);
		System.out.println(12345);
		
	}
}
