package app53;

public class L {
	static long test(float i)
	{
		return (long)i;
	}
	public static void main(String[] args) {
	short s = 10;
	double d1 = test(s);
	System.out.println(d1);
}
}
