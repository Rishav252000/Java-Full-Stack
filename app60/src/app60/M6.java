package app60;
class Z{
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage collector remove the object");
	}
}
public class M6 {
	public static void main(String[] args) throws Throwable{
		A a1 = new A();
		A a2 = a1;
		
		a1 = null;
		System.gc();
		Thread.sleep(1000);
		
		System.out.println(a1);
		
		System.out.println("object is abandoned , it eligible for garbage collector!");
	}
}
