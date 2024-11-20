package pack14;

class A{
	static synchronized void test1() {
		for(int i=0; i<=100; i++) {
			System.out.println("test1:" + i);
		}
	}
	static synchronized void test2() {
		for(int i = 0; i<=150; i++) {
			System.out.println("test2: " + i);
		}
	}
}
class B extends Thread{
	public void run() {
		A.test1();
	}
}
class C extends Thread{
	public void run() {
		A.test2();
	}
}
public class M1 {
	public static void main(String[] args) {
		B b1 = new B();
		b1.start();
		
		C c1 = new C();
		c1.start();
		
	}
}
