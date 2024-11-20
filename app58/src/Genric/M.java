package Genric;

public class M <T, V>{
	private T f1;
	private V f2;
	
	M(T f1, V f2)
	{
		this.f1 = f1;
		this.f2 = f2;
	}
	public T getKey()
	{
		int i =12;
		return f1;
	}
	public V getValue()
	{
		return f2;
	}
	
	public static void main(String[] args) {
		M <String, Integer> m = new M<>("Age", 43);
		System.out.println(m.getKey());
		System.out.println(m.getValue()); 
	}
}
