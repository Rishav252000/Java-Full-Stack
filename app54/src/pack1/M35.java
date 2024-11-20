package pack1;

public class M35 {
	public static void main(String[] args) {
		System.out.println(1);
		if(true)
		{
			System.out.println(2);
			throw new ArithmeticException();
		}
		System.out.println(3);
	}
}
