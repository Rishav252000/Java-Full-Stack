package ThreadClass;

public class M2 extends Thread{
	@Override
	public void run() {
		System.out.println("Child Thread");
		System.out.println(Thread.currentThread());
	}
	
	public static void main(String[] args) {
		new M2().start();
		
		System.out.println(Thread.currentThread());
		System.out.println("Parent Thread");
	}
}
