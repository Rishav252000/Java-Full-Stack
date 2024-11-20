class M22 
{
	public static void main(String[] args) 
	{
		Object o1 = new B();
		System.out.println(o1 instanceof Object);
		System.out.println(o1 instanceof A);
		System.out.println(o1 instanceof B);
		System.out.println(o1 instanceof C);
		System.out.println(o1 instanceof D);
	}
}
