package pack12;


class B extends Thread{
	
	@Override
	public void run() {
		System.out.println("B-thread-begin");
	//	obj.test1();
		synchronized (this) {
			try {
				this.wait();
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("B-thread - end");
	}
}

class C extends Thread{
	
	@Override
	public void run() {
//		obj.test1();
		System.out.println("C-thread - begin");
		synchronized (this) {
			try {
				this.wait();
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
		B b1 = new B();
		b1.start();
		
		C c1 = new C();
		c1.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("after sleep");
	//	a1.notifyAll();
		synchronized (b1) {
			b1.notifyAll();
		}
		synchronized (c1) {
			c1.notifyAll();
		}
	}
}

