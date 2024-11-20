package app64;

public class M7 {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 111; i++) {
					System.out.println(i);
				}
			}
		});
		t1.start();
		
		for(int i = 3011; i <= 4011; i++) {
			System.out.println(i);
		}
	}
}
