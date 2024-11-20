class B 
{
	private void test()
	{
		System.out.println("B()");	
	}
	
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test();
		System.out.println("done");
	}
}
