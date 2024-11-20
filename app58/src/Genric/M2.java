package Genric;
interface I{
	void print();
}
public class M2 extends Number implements I{
	private final int value;
	
	public M2(int value)
	{
		this.value = value;
	}
	@Override
	public void print() {
		System.out.println("MyNumber" + value);
	}

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
class Boxx<T extends Number & I>{
	 private T item;
	 public Boxx(int i) {
		 this.item = item;
	 }
	 public void test()
	 {
		 item.print();
	 }
	 public T getItem()
	 {
		 return item;
	 }
}
	 
	 class A{
		 public static void main(String[] args) {
			 
			 M2  m = new M2(12);
			Boxx<M2> b = new Boxx<M2>(12);
		}
	 }
