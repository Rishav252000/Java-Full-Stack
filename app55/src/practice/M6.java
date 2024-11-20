package practice;
class myThread extends Thread{
	@Override
	public void run() {
		for(int i = 890; i<1000; i++) {
			System.out.println("child thread");
		}
	}
}
public class M6 {
	public static void main(String[] args) {
		myThread t1 = new myThread();
		t1.start();
		
		for(int i = 222; i<1234; i++) {
			System.out.println("Main thread");
		}
	}
}
