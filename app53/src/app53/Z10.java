package app53;

public class Z10 {
	public static void main(String[] args) {
		test();
		test(30);
		test(30, 40);
		test(60, 100, 30);
		test(60, 100, 300, 2);
		test(60, 100, 300, 2, 100);
	}
	static void test(int ... args)
	{
		for(int i : args)
		{
			System.out.println(i);
		}
		System.out.println("-------");
	}
}
