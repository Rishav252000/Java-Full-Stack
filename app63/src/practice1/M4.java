package practice1;

public class M4 {
	public static void main(String[] args) {
		Thread m = new Thread() {
				public void run() {
					for(int i = 1; i <=108; i++)
					{
						System.out.println("!!Radha Shayam!!");
					}
				}
		};
		m.start();
		
		for(int i = 1; i <=108; i++)
		{
			System.out.println("!!Kanha ji!!");
		}
	}
}
