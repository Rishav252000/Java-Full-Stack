package app54;

import java.util.Scanner;

public class M49 {
	static String test(boolean b1)
	{
		if(b1)
		{
			System.out.println("if block " + 1);
			return "ab";
		}
		else {
			System.out.println("else block "+1);
		}
		System.out.println("method end " +2);
		return "abc";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a valid String");
		String s1 = sc.nextLine();
		try 
		{
			System.out.println("try begin " ); 

			boolean b1 = Boolean.parseBoolean(s1);
			test(b1);

			int i = 10 / 0;
			System.out.println("try end " +4);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Catch begin " +5);
			System.err.println(ex);
			System.out.println("Catch end " +6);
		}
		finally
		{
			System.out.println("Finally begin " +7);
			System.out.println("Finally block executes");
			System.out.println("Finally end" +8);
		}
		System.out.println("exit Finally block" +9);
	}
}
