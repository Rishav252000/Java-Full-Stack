package app65;
class C extends Thread{
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
}
public class M6 {
	public static void main(String[] args) {
		C c1 = new C();
		c1.start();
		
		
		System.out.println("done");
	}
}
