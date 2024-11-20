package pack1;

import java.io.IOException;

public class M13a {
	public static void main(String[] args)  {
		System.out.println(1);
		test();
		System.out.println(2);
	}
	static void test() {
		System.out.println(3);
		try {
			Thread.interrupted();	
		Thread.sleep(6000);
		System.out.println(1111111111);
		
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
			System.out.println(1234);
		}
		System.out.println(4);
	}
}
