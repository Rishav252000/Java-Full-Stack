package app54;

public class M36 {
	public static void main(String[] args) {
		try
		{
			System.out.println("try begin");
			int i = 10/0;
			System.out.println("try end");
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
		System.out.println("main");
	}
}
