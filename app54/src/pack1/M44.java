package pack1;

import java.io.FileNotFoundException;

public class M44 {
	public static void main(String[] args) {
		try
		{
			System.out.println(1);
			Class.forName("");
			System.out.println(1);
			Thread.sleep(10);
			
		}
		catch( ClassNotFoundException ex)
		{
			System.out.println(ex);
		}
		catch( InterruptedException ex)
		{
			System.out.println(ex);
		}
		catch( ArithmeticException ex)
		{
			System.out.println(ex);
			int i = 10 / 0;
		}
		System.out.println(12);
	}
}
