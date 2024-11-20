package app54;

public class M51 {
	public static void main(String[] args) {
		try
		{
			int i = Integer.parseInt(args[0]);
			System.out.println(i);
		}
		catch( ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("done  " + ex);
		}
		catch(Exception ex)
		{
			System.out.println("done 2");
		}
		
	}
}
