package app64;
class B implements Runnable{
	public void run() {
		for(int i = 3000; i < 4000; i++) {
			System.out.println(i);
		}
	}
}
public class M2 {
	public static void main(String[] args) {
		B b1 = new B();
		
		Thread t1 = new Thread(b1);
		t1.start();
		
		Thread t2 = new Thread();
		t2.start();
		
		Thread t3 = new Thread();
		t3.start();
		
		for(int i = 13000; i < 14000; i++) {
			System.out.println(i);
		}
	}
}
