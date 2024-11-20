package pack4;
class Util{
	static void  sleep(long millis) {
		try {
			Thread.sleep(millis);
		} 
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
class Shared {				//	    s2
	synchronized void test1(Shared obj) {
		System.out.println("test1 begin");
		Util.sleep(500);
	//	obj.test2(this); //this - s1
		this.test2(obj);
		System.out.println("test1 end");
		
	}						//		s1
	synchronized void test2(Shared obj) {
		System.out.println("test2 begin");
		Util.sleep(500);
	//	obj.test1(this); // this - s2
		this.test1(obj); //lock is not happening , stack over flow 
		System.out.println("test2 end");
	}
}

class A extends Thread {
	Shared s1, s2;
	A(Shared s1,Shared s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	public void run() {
		s1.test1(s2);
	}
}
class B extends Thread {
	Shared s1, s2;
	B(Shared s1, Shared s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	public void run() {
		s2.test2(s1);
	}
}

public class M2 {
	public static void main(String[] args) {
		Shared s1 = new Shared();
        Shared s2 = new Shared();
        A a1 = new A(s1, s2);
		a1.start();
		
		Util.sleep(250);
		
        B b1 = new B(s1, s2);
		b1.start();
		
		System.out.println("done");
	}
}