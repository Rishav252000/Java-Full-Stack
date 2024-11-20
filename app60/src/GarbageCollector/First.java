package GarbageCollector;

public class First {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized () method called ");
		
	}
	
	public static void main(String[] args) throws InterruptedException{
		First f = new First();
//		First f2 = f;
//		First f3 = f2;
//		First f4 = f3;
		f = null;
//		for (int i = 0; i < 10000; i++) {
//			System.err.println(i);
//		}
		System.gc();
		Thread.sleep(1000);
		System.out.println("Done");
		System.gc();
	}
}
