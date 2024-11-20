class A
{
	A()
	{
		super();//5
		System.out.println("A()");//6
	}
	A(int i)
	{
		this();	//4
		System.out.println("A(int)");//7
	}
}
class B extends A
{
	B()
	{
		this(90);
		System.out.println("B()");
	}
	B(int i)
	{
		super(20);	//3
		System.out.println("B(int)");//8
	}
}
class C extends B
{
	C()
	{
		super(10);	//2
		System.out.println("C()");//9
	}
	C(int i)
	{
		System.out.println("C(int)");
	}
}
class P
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A a1 = new A();
		System.out.println("-------------");
		B b1 = new B();
		System.out.println("-------------");
		C c1 = new C();	//	1
		System.out.println("-------------");
		A a2 = new A(10);
		System.out.println("-------------");
		B b2 = new B(20);
		System.out.println("-------------");
		C c2 = new C(30);
		System.out.println("-------------");
		System.out.println("main end");
	}
}
