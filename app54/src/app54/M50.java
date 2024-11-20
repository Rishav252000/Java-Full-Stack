package app54;

import java.util.Scanner;

public class M50 {
	Integer obj;
	M50()
	{
		try 
		{
			int i = obj;
		}
		catch(NullPointerException ex)
		{
			System.out.println(4);
			System.err.println(ex);
		}
		System.out.println(4);
		
	}
	static
	{
		
		try
		{
			System.out.println(12);
			int i = 10 /0;
		}
		catch(ArithmeticException ex)
		{
			System.err.println(ex);
			System.err.println(11);
		}
		
	}
	{
		int [] arr = {10, 20, 30, 40, 50};
		try {
			int k = arr[5];
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.err.println(ex);
		}
	}
	static int test(boolean b1)
	{
		if(b1)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(2);
		}
		return 19;
	}
	public static void main(String[] args) {
		M50 m = new M50();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s1 = sc.nextLine();
		try {
			Boolean b1 = Boolean.parseBoolean(s1);
			test(b1);
			Object obj1 = new Object();
			M50 m2 = (M50) obj1;
			
		}catch(ClassCastException ex)
		{
			System.err.println("ClassCastException   " + ex);
		}
		
		System.out.println("exit from try and catch");
	}
}
