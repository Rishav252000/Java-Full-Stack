package practice1;

import java.util.Iterator;

class E extends Thread{
	@Override
	public void run() {
		for(int i = 100; i<=1000; i+=5) {
			System.out.println("Child Thread !!!!");
		}
	}
}
public class M2 {
	public static void main(String[] args) {
		E e = new E();
		e.start();
		
		for(int i = 888; i<=1000; i+=5) {
			System.out.println("Main Thread !!!!");
		}
	}
}
