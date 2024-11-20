package app54;

public class M2f {
	public static void main(String[] args) {
		int [] arr = {10, 20, 30, 40};
		try
		{
			System.err.println(arr[4]);
			arr[4] = 100;
			System.err.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.err.println(arr[3]);
			System.out.println("complete handle");
		}
	}
}
