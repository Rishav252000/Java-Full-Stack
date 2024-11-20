package app64;
class C implements Runnable {
	public void run() {
		for(int i = 30; i < 40; i++) {
			System.out.println(i);
		}
	}
} 
class D implements Runnable {
	
		public void run()
		{
			for(int i = 300; i < 400; i++) {
				System.out.println(i);
		}
	}
}
	
public class M3{
	public static void main(String[] args) {
		C c1 = new C();
		Thread t1 = new Thread(c1);
		t1.start();
		
		D d1 = new D();
		Thread t2 = new Thread(d1);
		t2.start();
		
		
		for(int i = 13000; i < 14000; i++) {
			System.out.println(i);
		}
	}
}
