abstract class A
{
	abstract void test1();
	void test2()
	{
		System.out.println("A-test2");
	}
	abstract void test3();
}
abstract class B extends A
{
	void test1()
	{
		System.out.println("B-test1");
	}
}
class G 
{
	public static void main(String[] args) 
	{
		B obj = new B();
		obj.test1();
		obj.test2();
		obj.test3();
		System.out.println("done");
	}
}
