package app64;
class A implements Runnable{
	@Override
	public void run() {
		for(int i = 3000; i < 4000; i++) {
			System.out.println(i);
		}
	}
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		Thread t1 = new Thread(a1);
		t1.start();
		
		
		for(int i = 13000; i < 14000; i++) {
			System.out.println(i);
		}
	}
}
