package pack1;

import java.util.Scanner;

class AgeEx extends RuntimeException
{
	AgeEx(){
		
	}
	AgeEx(String s1)
	{
		super(s1);
	}
}

public class M42 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		if (age <= 18) {
			throw new AgeEx("You are unable to Vote");
		}
		else {
			System.out.println("Congratulation you are eligible !");
		}
	}
}
