package pack1;

import java.util.Scanner;

public class M41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter something : ");
		String s1 = sc.nextLine();
		test(s1);
		
	}
	static void test(String s1) {
		
		try {
			int i = Integer.parseInt(s1);
			int k = i /(i-9);
		}catch(NumberFormatException | ArithmeticException ex) {
			ex.printStackTrace();
		}
	}
}
