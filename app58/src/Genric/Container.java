package Genric;
interface GenricContainer<T>{
	void add(T item);
	T get();
}
public class Container <T> implements GenricContainer<T>{
	private T item;
	
	public void add(T item)
	{
		this.item = item;
	}
	
	public T get()
	{
		return item;
	}
	
	public static void main(String[] args) {
		Container<Integer> c = new Container<Integer>();
		c.add(12);
		
		System.out.println(c.get()); 
	}
}
