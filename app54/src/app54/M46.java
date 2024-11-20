package app54;

public class M46 {
	public static void main(String[] args) {
		try
		{
			System.out.println(1);
			try
			{
				int i = 10 / 0;
			}
			catch(ArithmeticException ex1)
			{
				System.out.println(2);
			}
			System.out.println(2);
			//several statements
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
		System.out.println("end");
	}
}
