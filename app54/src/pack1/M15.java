package pack1;

public class M15 {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(1);
		test1();
		System.out.println(2);
	}
	public static void test1() throws ClassNotFoundException {
		System.out.println(3);
			Class.forName(""); // it is checked type statement it is required try and catch block for handling

		System.out.println(4);
	}
}
