class M24 
{
	public static void main(String[] args) 
	{
		Test.f2(new D());
		System.out.println("--11--");
		Test.f2(new C());
		System.out.println("--22--");
		Test.f2(new B());
		System.out.println("--33--");
		Test.f2(new A());
		System.out.println("--44--");
		Test.f2(new Object());
		System.out.println("--55--");
	}
}
