package app54;

public class M2a {
	public static void main(String[] args) {
		System.out.println(1);
		try
		{
			int[] elements = {10, 20};
			int i = elements[2];
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex);
		}
		System.out.println(2);
	}
}
