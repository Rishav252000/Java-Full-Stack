package app54;

public class M32 {
	public static void main(String[] args) {
		try
		{
			int i = 10/ 0;
		}
		finally
		{
			System.out.println("Finally block");
		}
		System.out.println("ok");
	}
}
