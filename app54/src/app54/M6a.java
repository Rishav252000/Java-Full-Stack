package app54;

public class M6a {
	public static void main(String[] args) {
		System.out.println(1);
		test1(); // unhanded exception object
		System.out.println(2);
	}
	static void test1(){
		System.out.println(3);
		int i = 10 / 0;
		System.out.println(4);
		}
}
