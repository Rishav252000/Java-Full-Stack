package app64;

public class M10 {
	public static void main(String[] args) {
		Runnable r1 = ()-> {
			for(int i = 1; i <= 111; i++) {
				System.out.println(i);
			}
		};
		new Thread (r1).start();
		for(int i = 1; i <= 111; i++) {
			System.out.println(i);
		}
	}
}