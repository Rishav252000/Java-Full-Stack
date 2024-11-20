package app54;

	public class M21a {
		public static void main(String[] args) {
			System.out.println(1);
			
			try
			{
				System.out.println(111);
				int i = 10 / 0;
			}
			catch(ArithmeticException ex)
			{
				System.out.println(222);
				System.exit(0);
			}
			finally
			{
				System.out.println(555);
			}
			System.out.println(12345);
		}
}
