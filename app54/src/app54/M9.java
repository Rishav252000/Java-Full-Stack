package app54;

public class M9 {
	public static void main(String[] args) {
		if(args.length == 0) {
		String s1 = args[0];
		}
		String s1 = args[0];
		try
		{
			System.out.println(1);
			int i = Integer.parseInt(s1);
			System.out.println(2);
			int [] arr = {10, 20, 30, 40};
			int k = arr[i];
			System.out.println(3);
			int m = 1 / (3 - i);
			System.out.println(4);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			//AIOB specific any information
			System.out.println("ArrayIndexOutOfBoundsException" + ex);
		}
		catch(NumberFormatException ex)
		{
			//NFE specific any information
			System.out.println("NumberFormatException " + ex);
		}
		catch( ArithmeticException ex)
		{
			//AE specific any information
			System.out.println(" ArithmeticException " + ex);
		}
		
	}
}
