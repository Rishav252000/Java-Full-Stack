package app64;

public class M9 {
public static void main(String[] args) {
		
		new Thread(()-> {
				for(int i = 1; i <= 111; i++) {
					System.out.println(i);
				}
			}).start();
		
		for(int i = 3011; i <= 4011; i++) {
			System.out.println(i);
		}
	}
}
