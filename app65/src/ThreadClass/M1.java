package ThreadClass;
public class M1 extends Thread{
	@Override
	public void run() {
		
		System.out.println("aaaaa");
		System.out.println(Thread.currentThread());
	}
	public static void main(String[] args) {
		new Thread().start();
	//	System.out.println(Thread.currentThread());
		System.out.println(2);
	}
}
