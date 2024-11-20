package pack16;


class A{
	static void test1() {
		System.out.println("Test1  begin");
		synchronized (A.class){
			for(int i=0; i<=100; i++) {
				System.out.println("test1:" + i);
			}
		}
		System.out.println("Test1  end");
	}
	static synchronized void test2() {
		System.out.println("Test2  begin");
		synchronized (A.class){
			for(int i=0; i<=100; i++) {
				System.out.println("test2:" + i);
			}
		}
		System.out.println("Test2  end");
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

