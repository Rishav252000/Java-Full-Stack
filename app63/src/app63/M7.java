package app63;
class F extends Thread{
	@Override
	public void run() {
		System.out.println("run begin");
		int i =10/0;
		System.out.println("run end");
	}
}
public class M7 {
	public static void main(String[] args) {
		F f1 = new F();
		f1.start();
		
		for(int i = 1; i <1000; i++) {
			System.out.println(i);
		}
	}
}
