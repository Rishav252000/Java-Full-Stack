package practice;

public class M1 {
	int x = 10;
	class A{
		int x = 100;
		public void m1() {
			int x = 1000;
			System.out.println(x); //1000
			System.out.println(this.x);	// 100
			System.out.println(M1.this.x); //10
		}
	}
	public static void main(String[] args) {
		new M1().new A().m1();
	}
}
