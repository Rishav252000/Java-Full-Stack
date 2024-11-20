package app54;

public class M43 {
	public static void main(String[] args) {
		try
		{
			System.out.println(1);
			int i = 10/ 0;
			System.out.println(2);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(3);
			
			try
			{
				System.out.println(4);
				int j = 10 / 0;
			}
			catch(ArithmeticException ex1)
			{
				System.out.println(5);
			}
		}
	}
}
