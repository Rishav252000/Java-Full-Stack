package ThreadClass;

public class M3 {
	static void m1() {
		int i =10;
		 class AB{
			 int i = 12;
			void m2() {
				
				System.out.println(i);
			}
		}
		 
		 AB a = new AB();
		 a.m2();
		 System.out.println(a.getClass().getName());
	}
	public static void main(String[] args) {
		System.out.println("ddd");
		M3 m = new M3();
		m.m1();
	}
}
