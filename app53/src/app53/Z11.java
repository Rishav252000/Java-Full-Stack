package app53;

public class Z11 {
	public static void main(String[] args) {
		test("ab");
		test("abc" ,30);
		test("abcd" , 30, 40);
		test("abcde" , 60, 100, 30);
		test("abcdef" , 60, 100, 300, 2);
		test("abcdefg" , 60, 100, 300, 2, 100);
	}
	static void test(String s1, int ... args)
	{
		for(int i : args)
		{
			System.out.println(" "+i);
		}
		System.out.println("-------");
	}
}
