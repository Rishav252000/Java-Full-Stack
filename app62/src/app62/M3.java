package app62;
class C{
	static {
		System.out.println("C-SIB");
	}
	static void test() {
		System.out.println("C-Test");
	}
}
public class M3 {
	public static void main(String[] args) {
		C.test();
		System.out.println("-------");
		try {
			Class c1 = Class.forName("app62.C");
			System.out.println(c1);
		}
		catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
