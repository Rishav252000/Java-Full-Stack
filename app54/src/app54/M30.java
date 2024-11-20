package app54;

public class M30 {
	public static void main(String[] args) {
		try
		{
			System.out.println("done0");
		}
		catch(ArithmeticException ex)
		{
			System.out.println("done1");
		}
		catch(NullPointerException ex)
		{
			System.out.println("done2");
		}
		finally
		{
			System.out.println("done3");
		}
		
		System.out.println("done");
	}
}
