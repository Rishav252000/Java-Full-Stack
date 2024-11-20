package practice;

import java.nio.file.spi.FileSystemProvider;

class D{
	public void m1() {
		System.out.println("Salty");
	}
}
public class M5 {
	public static void main(String[] args) {
		D d1 = new D() {
			public void m1() 
			{
				System.out.println("Spicy");
			}
		};
		d1.m1();
		D d2 = new D();
		d2.m1();
		
		D d3 = new D() {
			public void m1()
			{
				System.out.println("sweet");
			}
		};
		d3.m1();
		System.out.println(d1.getClass().getName());
		System.out.println(d2.getClass().getName());
		System.out.println(d3.getClass().getName());
	}
}
