package app60;
class D{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("i am from finalized ");
	}
}
public class M4 {
	public static void main(String[] args) {
		D d1 = new D();
		d1 = null;
		System.gc();
		System.out.println("done");
		//Runtime.getRuntime().gc();
	}
}
