package pack1;

import java.util.Scanner;
class AgeNegativeException extends ArithmeticException
{
	public AgeNegativeException() {
		// TODO Auto-generated constructor stub
	}
	AgeNegativeException (String msg){
		super(msg);
	}
}
public class M37 {
	public static void main(String[] args) {
		System.out.println(1);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = sc.nextInt();
		if(age <= 0) {
			throw new AgeNegativeException("Age should be greater than 0");
		}
	}
}
