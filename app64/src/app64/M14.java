package app64;

public class M14 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				System.out.println(1);
			}
		})
		{
			public void run() {
				System.out.println(2);
		}
		
		}.start();
	
	}
}
