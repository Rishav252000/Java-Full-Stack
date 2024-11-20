package pack1;

public class M14 {
	public static void main(String[] args) {
		System.out.println(1);
		test1();
		System.out.println(2);
	}
	public static void test1() {
		System.out.println(3);
		try {
			Class.forName(""); // Class.forName("") with a try catch
		}
		catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		System.out.println(4);
	}
}
