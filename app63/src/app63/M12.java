package app63;

public class M12 {
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				for(char i = 65; i<=90; i++) {
					System.out.println(i); // we can  convert to char to int using Charater.toChars(i);
				}
			}
		}.start();
		for(char i = 97; i<=122; i++) {
			System.out.println(i);
		}
	}
}
