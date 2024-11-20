package pack19;

class A extends Thread{
	ThreadGroup tg;
	A (ThreadGroup tg, String name){
		super(tg, name);
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
class B implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class M1 {
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("first group");
		A a1 = new A(tg, "1st Thread");
		A a2 = new A(tg, "2st Thread");
		A a3 = new A(tg, "3st Thread");
		
		B b1 = new B();
		Thread t1 = new Thread(tg, b1, "4th thread");
		Thread t2 = new Thread(tg, b1, "5th thread");
		Thread t3 = new Thread(tg, b1, "6th thread");
		
		a1.start();
		a2.start();
		a3.start();
		t1.start();
		t2.start();
		t3.start();
		
		tg.setMaxPriority(Thread.MAX_PRIORITY);
	//	tg.stop();
	}
}
