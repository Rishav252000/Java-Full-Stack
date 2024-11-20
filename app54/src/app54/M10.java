package app54;

public class M10 {
	public static void main(String[] args) {
		if(args.length == 0) {
			return;
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
		catch( ArrayIndexOutOfBoundsException |
			   NumberFormatException | ArithmeticException ex)
		{
			//generic information to AE, AIOB, NFE
			System.out.println("AIOB, NFE, AE " + ex);
		}
		System.out.println(5);
	}
}
