package app53;

public class M {
	static void test(Object i)
	{
		System.out.println("Integer");
	}
	static void test(Long l)
	{
		System.out.println("Long");
	}
	public static void main(String[] args) {
		
		byte i = 10;
		test(i);
	}

}
