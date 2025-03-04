package RunnableThread;

public class M1 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i<=5; i++) {
					System.out.println("Child Thread!!");
				}
				System.out.println(Thread.currentThread().getPriority());
			}
		}).start();
		//System.out.println(Thread.currentThread());
		
		Runnable r1 =  () ->
				 	System.out.println("runn");
		Thread t1 = new Thread(r1);
		
		for(int i =1; i<=5; i++) {
			System.out.println("Parent Thread!!");
		}
		System.out.println(Thread.currentThread());
	}
}
