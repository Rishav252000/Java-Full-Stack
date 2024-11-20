package app65;
public class M9 {
	static class A extends Thread {
		public void run() {
		 for(int i = 1; i <= 30000; i++) {
			try {
				Thread.sleep(1);
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		 }
		 System.out.println("chlid done");
			}
	}
	
	static class B extends Thread {
		Thread main;
		B(Thread main){
			this.main = main;
		}
		public void run() {
		 System.out.println("b-started");
	    try {
	    	Thread.sleep(1000);
	    }
	    catch(InterruptedException ex) {
	    	ex.printStackTrace();
	    }
	    main.interrupt();
		}
	}
		
	public static void main(String[] args) {
		System.out.println("main begin");
	  Thread t1 = Thread.currentThread();
		A a1 = new A();
		a1.start();
		B b1 = new B(t1);
		b1.start();
		
		try {
			a1.join();
			} 
		catch (InterruptedException e) {
			  e.printStackTrace();
		}
		System.out.println("main end");
	}
}
