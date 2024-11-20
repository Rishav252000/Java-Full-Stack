package app53;

public class I {
	static int i;
	static void add(Integer k)
	{
		int m = i + k;
		System.out.println(m);
	}
	public static void main(String[] args) {
		add(10);
	}
}
