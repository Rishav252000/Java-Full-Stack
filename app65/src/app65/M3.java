package app65;

public class M3 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		
		try {
			t1.setDaemon(true);
		}catch(IllegalThreadStateException ex) {
			ex.printStackTrace();
		}
		
		
		
		System.out.println(t1.isDaemon());
	}
}
