package pack1;

public class M5 {
	public static void main(String[] args) throws Throwable{
		M5 obj = new M5();
		System.out.println(1);
		
		System.out.println(2);
		try
		{
			Class.forName("");
		}
		catch(ClassNotFoundException  ex)
		{
			ex.printStackTrace();
		}
	}
	static void test()  {
		int i = 10 / 0;
	}
}
