package practice;

public class M14 {
	private int i = 10;
	private int j = 110;
	private int k;
	public interface D
	{
		int i = 20;
		  void test();
	}
	 class E implements D
	{
		public void test()
		{
			j = 13;
			System.out.println(i);
			System.out.println(j);
			System.out.println(k);
		}
	}
	
	public static void main(String[] args) {
		M14 m = new M14();
		M14.E e1 =  m.new E();
		e1.test();
	}
}
