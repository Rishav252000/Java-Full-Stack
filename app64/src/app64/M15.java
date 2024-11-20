package app64;

public class M15 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				System.out.println(1);
			}
		})
		{
		}.start();
	}
}
