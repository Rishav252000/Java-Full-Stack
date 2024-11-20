package app62;
class D{
	void test() {
		System.out.println("test");
	}
}
public class M4 {
	public static void main(String[] args) throws Exception{
		Class c1 = Class.forName("app62.D");
		D d1 = (D) c1.newInstance();
		d1.test();
	}
}
