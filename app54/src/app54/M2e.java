package app54;

public class M2e {
	public static void main(String[] args) {
		int [] ab = {10,10, 10, 10, 10};
		try
		{
			for(int i = 0; i <= ab.length; i++)
			{
				
				System.out.println(i);
				
			}
		}
		catch (ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("handle");
		}
	}
}
