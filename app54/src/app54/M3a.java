package app54;

public class M3a {
	public static void main(String[] args) {
		String str = null;
		try
		{
			 System.out.println(str.length());
		}
		catch(NullPointerException ex)
		{
			System.out.println("Complete Handling");
		}
	}
}
