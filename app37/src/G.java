class G 
{
	void test1()
	{
		System.out.println("test1:" + this);
	}
	void test2()
	{
		System.out.println("test2:" + this);
	}
	
	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println("main:" + g1);
		g1.test1();
		g1.test2();
	}
}
