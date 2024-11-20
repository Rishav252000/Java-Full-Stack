package app54;

import java.util.Scanner;

public class M4c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter valid String");
			String str = sc.nextLine();
			String [] word = str.split(" ");
			
			String s2 = word[1];
			
			System.out.println("Enter number: ");
			String s1 = sc.nextLine();
			int i = Integer.parseInt(s1);
			
			int k = i/(i-9);
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException ex)
		{
			System.out.println(ex);
		}
		System.out.println("exit from try and catch !");
	}
}
