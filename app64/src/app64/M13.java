package app64;

public class M13 {
	static Runnable getRunnable() {
	return new Runnable() {
		public void run() {
			for(int i = 1; i<=1001; i++) {
				System.out.println(i);
			}
		}
	};
	
}
public static void main(String[] args) {
	new Thread(getRunnable()).start();
	for(int i = 4000; i<= 5000; i++) {
		System.out.println(i);
	}
  }
}
