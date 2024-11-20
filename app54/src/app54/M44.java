package app54;

public class M44 {
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
		}
		finally
		{
			System.out.println(4);
			
				try
				{
					System.out.println(5);
					int i = 10/ 0;
					System.out.println(6);
				}
				catch(ArithmeticException ex)
				{
					System.out.println(7);
					
					try
					{
						System.out.println(8);
						int j = 10 / 0;
					}
					catch(ArithmeticException ex1)
					{
						System.out.println(9);
					}
				}
			
		}
		System.out.println(4);
	}
}
