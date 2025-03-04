package app66;
class Shared {
	//void test1() {
	synchronized void test1() {
		String name = Thread.currentThread().getName();
		for(int i = 1; i<=1000; i++) {
			System.out.println(name + "-test1-" + this + i);
		}
	}
}


class A extends Thread {
	Shared s1;
	A(Shared s1){
		this.s1 = s1;
	}
	public void run() {
		s1.test1();   //   a thred 
	}
}

class B extends Thread {
	Shared s1;
	B(Shared s1){
		this.s1 = s1;
	}
	public void run() {
		s1.test1();
	}
}

public class M1 {
	public static void main(String[] args) {
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		
		A a1 = new A(s1);
		a1.start();
		
		B b1 = new B(s2);
		b1.start();
		
		
		System.out.println("done");
	}
}
