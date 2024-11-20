package app54;

public class M15 {
	static Integer obj;
	M15()
	{
		
		try
		{
			
		}
		catch(NullPointerException ex)
		{
			
			System.out.println("Null pointer Exception" + ex);
		}
		finally
		{
			System.out.println("Finally block executed");
		}
	}
	public static void main(String[] args) {
		M15 m = new M15();
		System.out.println("done");
	}
}
