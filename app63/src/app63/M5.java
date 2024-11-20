package app63;
class D extends Thread{
	public void run() {
		for(int i = 3000; i <= 4000; i++) {
			System.out.println(i);
		}
	}
}
	
public class M5 {
	public static void main(String[] args) {
		D d1 = new D();
		d1.start();
		
		D d2 = new D();
		d2.start();
		
		D d3 = new D();
		d3.start();
		
		for(int i = 13000; i <= 14000; i++) {
			System.out.println(i);
		}
	}
}
