package pack1;

public class M50 {
	public static void main(String[] args) {
		try {
			test1();
		}
		catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("Exception");
		}
	}
	static void test1() {
		try {
			String s1 = null;
			System.out.println(s1.length());
		}
		finally {
			System.out.println("Finally");
		}
	}
}
