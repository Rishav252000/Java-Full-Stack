package practice1;

public class M5 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <=108; i++)
				{
					System.out.println("Shiva");
				}
			}
		}).start();
		
		for(int i = 1; i <=108; i++)
		{
			System.out.println("!!Bhola ji!!");
		}
	}
}
