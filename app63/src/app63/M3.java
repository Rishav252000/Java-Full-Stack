package app63;
class A extends Thread{
	@Override
	public void run() {
		for(int i = 3000; i <=4000; i++) {
			System.out.println(i);
		}
	}
}
public class M3 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		
		
		for(int i = 8000; i <9000; i++) {
			System.out.println(i);
		}
	}
}
