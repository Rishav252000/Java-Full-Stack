package app53;
class AB
{
	void test(Byte b)
	{
		System.out.println("Byte");
	}
	void test(byte b)
	{
		System.out.println("byte");
	}
	void test(int i)
	{
		System.out.println("int");
	}
	void test(byte... b)
	{
		System.out.println("byte...");
	}
}
public class N {
	public static void main(String[] args) {
		AB a = new AB();
		a.test((byte)10);
	}
}
