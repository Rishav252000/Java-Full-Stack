package practice1;
class A extends Thread{
	@Override
	public void run() {
		System.out.println("class A");
	}
}
class B extends Thread{
	@Override
	public void run() {
		System.out.println("Class B");
	}
}
class C extends Thread{
	@Override
	public void run() {
		System.out.println("Class");
	}
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		
		A a2 = a1;
		a2.start();
		B b1 = new B();
		C c1 = new C();
		
	}
}
