package pack20;
class A extends Thread{
	public void run() {
		for(int i=1; i<= 100; i++) {
			System.out.println(i);
			Thread.yield();
		}
	}
}

class B extends Thread{
	public void run() {
		for(int i=100; i<= 1000; i++) {
			System.out.println(i);
			//Thread.yield();
		}
	}
}
public class M2 {
	public static void main(String[] args) {
		 A a1 = new A();
		 a1.start();
		 
		 B b1 = new B();
		 b1.start();
	}
}
