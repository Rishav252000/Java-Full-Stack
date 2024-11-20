package pack18;

class Util{
	static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}


class A extends Thread{
	ThreadLocal<Integer> t;
	A(ThreadLocal<Integer> t){
		this.t = t;
	}
	
	public void run() {
		System.out.println("a:" + t.get());
		t.set(t.get() + 10);
		Util.sleep(500);
		
		System.out.println("b:" + t.get());
		t.set(t.get() + 10);
		Util.sleep(500);
		
		System.out.println("c:" + t.get());
		t.set(t.get() + 10);
		Util.sleep(500);
		
		System.out.println("d:" + t.get());
		t.set(t.get() + 10);
	}
}

class B extends Thread{
	ThreadLocal<Integer> t;
	B(ThreadLocal<Integer> t){
		this.t = t;
	}
	
	public void run() {
		System.out.println("e:" + t.get());
		t.set(t.get() + 10);
		Util.sleep(500);
		
		System.out.println("f:" + t.get());
		t.set(t.get() + 10);
		Util.sleep(500);
		
		System.out.println("g:" + t.get());
		t.set(t.get() + 10);
		Util.sleep(500);
		
		System.out.println("h:" + t.get());
		t.set(t.get() + 10);
	}
}
public class M1 {
	public static void main(String[] args) {
		ThreadLocal<Integer> t  = new ThreadLocal<Integer>();
		t.set(15);
		System.out.println("i = " + t.get());
		A a1 = new A(t);
		a1.start();
		Util.sleep(250);
		B b1 = new B(t);
		b1.start();
		Util.sleep(5000);
		System.out.println("j:" + t.get());
	}
}
