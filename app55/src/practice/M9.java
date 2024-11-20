package practice;

class Y implements Runnable{
	@Override
	public void run() {
		for(int i = 890; i<1000; i++) {
			System.out.println("child thread");
		}
	}
}
public class M9 {
	public static void main(String[] args) {
		Y r = new Y();
		Thread t1 = new Thread();
		Thread t2 = new Thread(r);
		Thread t3 = new Thread("asdsaf");
		Thread t4 = Thread.currentThread();
		t2.start();
		t1.start();
		System.out.println(t1);
		System.out.println(t4);
		System.out.println(t2);
		System.out.println(t3);
		
		for(int i = 100; i<300; i++) {
			System.out.println("main thread");
		}
	}
}
