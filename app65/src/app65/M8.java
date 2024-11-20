package app65;

class E extends Thread{
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
}
public class M8 {
	public static void main(String[] args) {
		E e1 = new E();
		e1.start();
		try {
			e1.join();
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
