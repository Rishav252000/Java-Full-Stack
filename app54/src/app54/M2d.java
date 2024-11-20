package app54;

public class M2d {
	public static void main(String[] args) {
		String [] str = {"abc", "xyz", "pqr"};
		String str2 = str[3];
		try
		{
			System.out.println(str2);
			
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(str2);
			System.out.println(ex);
		}
	}
}
