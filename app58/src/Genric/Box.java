package Genric;

public class Box<T> {
	T i;
	T j;
	
	public T test(T i)
	{
		this.i = i;
		System.out.println();
		return i;
	}
	public T test1(T j)
	{
		this.j = j;
		System.out.println();
		return j;
	}
	public static void main(String[] args) {
		Box<Integer> b = new Box<>();
		int a = b.test(100);
		int c = b.test(10);
		System.out.println(a+c);
	}
}
