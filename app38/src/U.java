class A
{
	A(int i)
	{
		System.out.println("A(int)");
	}
	A()
	{
		System.out.println("A()");
	}
}
class U extends A 
{
	U(int i)
	{
		System.out.println("S(int)");
		super(90);
	}	
	public static void main(String[] args) 
	{
		A a1 = new A(90);		
		System.out.println("---------------");
		U r1 = new U(90);
	}
}
