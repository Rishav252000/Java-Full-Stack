package app60;
class E {
	static E obj;
	@Override
	protected void finalize() throws Throwable {
		obj = this;   //obj = this; likha hai, jo dead object ka reference obj static variable ko de deta hai.
		System.err.println("removed object");
	}
}
public class M5 {
	public static void main(String[] args) throws Throwable{
		E e1 = new E();
		System.out.println("a:" + e1);
		System.out.println("b:" + E.obj);
		e1 = null;
		System.gc();
		Thread.sleep(1000);
		System.out.println("c:" + e1);
		System.out.println("d:" + E.obj); 
		E.obj = null; 
		System.gc(); // garbage collector, it is Resurrected object 
		Thread.sleep(1000); // 
		System.out.println("e:" + e1);
		System.out.println("f:" + E.obj);	
	}
}
