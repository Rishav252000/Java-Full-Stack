package Runnable;


public class M3 {
	static Thread getThread() {
		Thread t1 = new Thread(){
			public void run() {
				for(int i = 0; i<=108; i++) {
					System.out.println("!!Shiya Ram!!");
				}
			}
		};
		return t1;
	}
	public static void main(String[] args) {
		getThread().start();
		
		for(int i = 0; i<=108; i++) {
			System.out.println("!! Shivshankar !!");
		}
	}
}
