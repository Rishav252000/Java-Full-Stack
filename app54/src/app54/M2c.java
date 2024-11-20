package app54;

public class M2c {
	public static void main(String[] args) {
		int [] elements = {10, 20, 30, 40};
		
		try
		{
			System.out.println("try begin");
			int i = elements[4];
			System.out.println("try end");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("handling");
		}
	}
}
