package app54;

public class M2b {
	public static void main(String[] args) {
		System.out.println("Exception handling");
		try
		{
			int [] elements = {10, 20, 30};
			int i = elements[3];
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Handle");
			int j =10 ;
			System.out.println("Handle");
		}
	}
}
