package practice1;
class F implements Runnable{
	@Override
	public void run() {
		for(int i = 234; i<= 546; i++) {
			System.out.println("Child !!"  + i);
		}
	}
}
public class M3 {
	public static void main(String[] args) {
		F r = new F();
		Thread t1 = new Thread(r);
		t1.start();
		
		for(int i = 1; i<= 108; i++) {
			System.out.println("Ram siya Ram !!" + i);
		}
		
	}
}
