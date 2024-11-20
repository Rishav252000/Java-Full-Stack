package practice;
class B{
	public void m1() {
		class Inner{
			public void sum(int x, int y) {
				System.out.println("The sum is:" + (x+y));
			}
			
		}
		Inner i = new Inner();
		i.sum(100, 200);
		i.sum(200, 3000);
	}
}
public class M3 {
	public static void main(String[] args) {
		B b = new B();
		b.m1();
		
	}
}
