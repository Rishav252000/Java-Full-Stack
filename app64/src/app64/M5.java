package app64;

public class M5 {
	public static void main(String[] args) {
		class A implements Runnable{
			@Override
			public void run() {
				for(int i = 3000; i <= 4000; i++) {
					System.out.println(i);
				}
			}
		}
		
		A a1 = new A();
		Thread t1 = new Thread(a1);
		t1.start();
		
		
		for(int i = 3011; i <= 4011; i++) {
			System.out.println(i);
		}
	}
}
