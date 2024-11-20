package app54;

public class M16 {
	public static void main(String[] args) {
		System.out.println(1);
		if(true)
		{
			return;
		}
		try
		{
			System.out.println(111);
			
			
		}
		catch(ArithmeticException ex)
		{
			System.out.println(222);
		}
		finally
		{
			System.out.println(555);
		}
	}
}
