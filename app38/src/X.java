class A
{
	static
	{
		System.out.println("A-SIB");
	}
}




class X extends A 
{
	static
	{
		System.out.println("X-SIB");
	}	
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
}
