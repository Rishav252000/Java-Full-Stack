package app64;

public class M4 {
	static class A implements Runnable{
		@Override
		public void run() {
			for(int i = 300; i <= 400; i++) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		A a1 = new A();
		Thread t1 = new Thread(a1);
		t1.start();
		
		
		for(int i = 3001; i <= 4001; i++) {
			System.out.println(i);
		}
	}
}
