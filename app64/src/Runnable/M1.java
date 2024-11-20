package Runnable;

public class M1 {
	public static void main(String[] args) {
		Runnable r = () -> {
			for(int i = 1; i<=108; i++) {
				System.out.println("!!Ram Siya Ram!!");
			}
		};
		
		Thread t1 = new Thread(r);
		t1.start();
		
		for(int i = 1; i<=108; i++) {
			System.out.println("!! Radhe Radhe !!");
		}
	}
}
