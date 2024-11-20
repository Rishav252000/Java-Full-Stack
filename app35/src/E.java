class E 
{

	E()
	{
		System.out.println("E()");
	}
	E(int i)
	{
		this();
		System.out.println("E(int)");
	}
	
	public static void main(String[] args) 
	{
		E e1 = new E();
		System.out.println("-------------------------");
		E e2 = new E(90);
	}
}
