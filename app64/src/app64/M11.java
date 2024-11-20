package app64;

public class M11 {
	static Thread test() {
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 1; i<=1001; i++) {
					System.out.println(i);
				}
			}
		};
		return t1;
	}
	public static void main(String[] args) {
		test().start();
		for(int i = 4000; i<= 5000; i++) {
			System.out.println(i);
		}
	}
}
		
	
	
