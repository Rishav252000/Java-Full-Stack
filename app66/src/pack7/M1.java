package pack7;

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
		A a2 = new A();
		Thread1 t2 = new Thread1(a2);
		t1.start();
		A a3 = new A();
		Thread1 t3 = new Thread1(a3);
		t1.start();
		A a4 = new A();
		Thread1 t4 = new Thread1(a4);
		t4.start();
	
		try {
			
			Thread.sleep(1000);
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}

		System.out.println("After sleep");
		a2.test2();
	}
}


