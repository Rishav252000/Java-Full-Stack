package app63;
class Z extends Thread{
	@Override
	public void run() {
		for(int i = 100; i <= 123; i++) {
			System.out.println(i);
		}
	}
}
class Z1 extends Thread {
	@Override
	public void run() {
		for(char i = 65; i<=90; i++) {
			System.out.println(i);
		}
	}
}
public class M13 {
	public static void main(String[] args) {
		Z a1 = new Z();
		a1.start();
		
		Z1 b1 = new Z1();
		b1.start();
	}
}
