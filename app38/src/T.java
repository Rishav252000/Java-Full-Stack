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
class T extends A 
{
	T(int i)
	{
		super(90);
		System.out.println("S(int)");
	}	
	public static void main(String[] args) 
	{
		A a1 = new A(90);		
		System.out.println("---------------");
		T r1 = new T(90);
	}
}
