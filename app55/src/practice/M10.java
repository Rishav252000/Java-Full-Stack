package practice;

public class M10 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 890; i<1000; i++) {
					System.out.println("child thread");
				}
			}
		}).start();
		
		for(int i = 350; i<550; i++) {
			System.out.println("Main thread");
		}
	}
}
