package app64;

public class M12 {
	static Runnable getRunnable() {
		return new Runnable() {
			@Override
			public void run() {
				for(int i = 10; i< 151; i++)
				{
					System.out.println(i);
				}
			}
		};
	}
	public static void main(String[] args) {
		new Thread(getRunnable()).start();
		for(int i = 401; i< 551; i++)
		{
			System.out.println(i);
		}
	}
}
