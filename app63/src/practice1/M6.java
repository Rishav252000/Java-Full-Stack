package practice1;

public class M6 {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 108; i++)
				{
					System.out.println("!!Shiv Shankar!!");
				}
			}
		};
		
		Thread t1 = new Thread(r);
		t1.start();
		
		for(int i = 1; i <= 108; i++)
		{
			System.out.println("!!Mahadev!!");
		}
	}
}
