class G 
{
	G()
	{
		System.out.println("G()");
	}
	
	{
		System.out.println("G-IIB");
	}
	
	G(int i)
	{
		this();
		System.out.println("G(int)");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		G g1 = new G();
		System.out.println("---------------");
		G g2 = new G(20);
		System.out.println("---------------");
		G g3 = new G(10);
		System.out.println("---------------");
		System.out.println("main end");
	}
}
