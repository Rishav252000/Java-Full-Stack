package app54;

public class M51a {
	public static void main(String[] args) {
		int i = test("50");
		System.out.println(i);
		
	}
	static int test(String s1)
	{
		try {
			int i = Integer.parseInt(s1);
			return i;
		}
		catch(NumberFormatException ex)
		{
			return 0;
		}
		finally 
		{
			return 100;
		}
	}
}
