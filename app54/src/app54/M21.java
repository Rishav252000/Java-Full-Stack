package app54;

	public class M21 {
		public static void main(String[] args) {
			System.out.println(1);
			
			try
			{
				System.out.println(111);
				System.exit(0);
			}
			catch(ArithmeticException ex)
			{
				System.out.println(222);
				return;
			}
			finally
			{
				System.out.println(555);
			}
			System.out.println(12345);
		}
	}
