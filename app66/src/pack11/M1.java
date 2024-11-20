package pack11;

class A{
//	synchronized void test1() {
//		System.out.println("test1 begin");
//		try {
//			wait();
//		}catch(InterruptedException ex) {
//			ex.printStackTrace();
//		}
//		System.out.println("test1 end");
//	}
	
	
//	synchronized void test2() {
//		System.out.println("test2 begin");
////		notify();
//	//	notifyAll();
//		System.out.println("test2 end");
//	}
}

class B extends Thread{
	A obj;
	B(A obj){
		this.obj = obj;
	}
	@Override
	public void run() {
		System.out.println("B-thread-begin");
	//	obj.test1();
		synchronized (obj) {
			try {
				obj.wait();
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("B-thread - end");
	}
}

class C extends Thread{
	A obj;
	C(A obj){
		this.obj = obj;
	}
	@Override
	public void run() {
//		obj.test1();
		System.out.println("C-thread - begin");
		synchronized (obj) {
			try {
				obj.wait();
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("C-thread - end");
	}
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B(a1);
		b1.start();
		
		C c1 = new C(a1);
		c1.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("after sleep");
	//	a1.notifyAll();
		synchronized (b1) {
			a1.notifyAll();
		}
	}
}

