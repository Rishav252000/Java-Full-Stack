package practice;

public class M7 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i = 890; i<1000; i++) {
					System.out.println("child thread");
				}
			}
		};
		t1.start();
		
		for(int i = 222; i<1234; i++) {
			System.out.println("Main thread");
		}
	}
}
