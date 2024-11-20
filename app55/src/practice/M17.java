package practice;

public class M17 {
	static {
		System.err.println();
	}
	M17 (){
		System.out.println("const");

	 class B extends M17{
		static int i;
		B(){
			{
				System.out.println(5);
			}
			System.out.println(1);
		}
		}
	 B b1 = new B();
	}
	public static void main(String[] args) {
		M17 a1 = new M17();
		
	}
}
