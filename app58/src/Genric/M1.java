package Genric;

interface Box1<DataType>
{
	DataType test1();
	void test2(DataType d1, DataType d2);
	void test3(DataType d1);
}
public class M1<DataType> implements Box1<DataType>{
	private DataType d1;
	private DataType d2;
	private DataType d3;
	public DataType test1()
	{
		
		return d1;
	}
	public void test3(DataType d3)
	{
		this.d3 = d3;
		System.out.println("test3 " + d3);
	}
	public void test2(DataType d1, DataType d2)
	{
		this.d1 = d1;
		this.d2 = d2;
		System.out.println("test2 " +d1);
		System.out.println("test2 " +d2);
	}
	
	public static void main(String[] args) {
		M1 <Integer> m = new M1<>();
		m.test2(12, 22);
		m.test3(112);
		System.out.println(m.test1());
		
		M1 <String> m1 = new M1<>();
		m1.test2("abc", "asd");
		m1.test3("asd");
		System.out.println("test1 " + m1.test1());
		
		M1 <Boolean> m2 = new M1<>();
		m2.test2(true, false);
		m2.test3(false);
		System.out.println("test1 " + m2.test1());
		
	}
}
