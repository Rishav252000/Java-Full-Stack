package pack1;

import java.util.Scanner;

public class M36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		int age = sc.nextInt();
		
		if(age <= 0)
		{
			
			throw new ArithmeticException("Age should be greaater than 0 ");
		}
		// Continue...
		System.out.println("Done");
	}
}
