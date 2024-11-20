class A
{
	static int i = 10;
	
	static
	{
		System.out.println("A-SIB");
	}
}
class B extends A
{
	static
	{
		System.out.println("B-SIB");
	}
}
class M5 
{
	public static void main(String[] args) 
	{
		System.out.println(B.i);
	}
}
