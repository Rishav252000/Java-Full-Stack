package app65;
class AB extends Thread{

	@Override
	public void run() {
		Thread t3 = Thread.currentThread();
		System.out.println(t3.getId());
		System.out.println(t3.getName());
		System.out.println(t3.getPriority());
		System.out.println(t3.isDaemon());
		System.out.println("---------------");
	}
}
class BC extends Thread{
	public void run() {
		Thread t2 = Thread.currentThread();
		System.out.println(t2.getId());
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());
		System.out.println(t2.isDaemon());
	}
}
public class M5 {
	public static void main(String[] args) {
		
		Thread t1 = Thread.currentThread();
		
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
		System.out.println("---------------");
		t1.setPriority(Thread.MAX_PRIORITY);
	 	
		A a1 = new A();
		a1.run(); // child thread
		B b1 = new B();
		b1.run();
	}
}
