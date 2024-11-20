package app65;
class A extends Thread{
	@Override
	public void run() {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
		System.out.println("---------------");
		
	}
}
class B extends Thread{
	public void run() {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
		
	}
}
public class M4 {
	public static void main(String[] args) {
		
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
		System.out.println(t1.isDaemon());
		System.out.println("---------------");
		
		A a1 = new A();
		a1.start();
		B b1 = new B();
		b1.start();
		t1.setDaemon(true);
	}
}
