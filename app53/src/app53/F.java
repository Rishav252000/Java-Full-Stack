package app53;

public class F {
	static int i = test();
	public static void main(String[] args) {
		// int i = test().intValue();
		System.out.println(i);
		System.out.println("done");
	}
	static Integer test()
	{
		int i = 100;
		Integer obj = Integer.valueOf(i);
		return obj;
	}
}
