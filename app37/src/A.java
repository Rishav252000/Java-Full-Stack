class A 
{
	static int count;
	
	A()
	{
		count++;
	}
	
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		A a5 = new A();
		A a6 = new A();
		System.out.println(A.count);
		System.out.println(a1.count);
		System.out.println(a3.count);
		System.out.println(a6.count);
	}
}
