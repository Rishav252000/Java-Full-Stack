package practice;

public class M8 {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() 
			{
				for(int i = 890; i<1000; i++) {
					System.out.println("child thread");
				}
			}
		};
		
		Thread t1 = new Thread(r);
		t1.start();
		
		for(int i = 90; i<999; i+=5) {
			System.out.println("Main thread");
		}
	}
}
