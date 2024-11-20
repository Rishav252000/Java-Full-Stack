package pack5;
class A {
	synchronized void test1() {
		System.out.println("test1 begin");
	try {
		wait();
	}
	catch(InterruptedException ex) {
		ex.printStackTrace();
	}
	System.out.println("test1 end");
	
}
	synchronized void test2() {
		System.out.println("test2 begin");
	notify();
	System.out.println("test2 end");
	
}
	
	
}

class Thread1 extends Thread{
	A obj;
	Thread1 (A obj){
		this.obj = obj;
	}
	public void run() {
		obj.test1();
	}
}
public class M1 {
	public static void main(String[] args) {
		System.out.println("main begin");
		A a1 = new A();
	
		Thread1 t1 = new Thread1(a1);
		
		t1.start();
	
		try {
			
			Thread.sleep(1000);
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}

		System.out.println("After sleep");
		a1.test2();
	}
}
