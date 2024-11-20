package pack1;

public class M17 {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(1);
		
			test1(); // if u don't want to handle the calling statement here u can add line no.4 throw ClassNotFoundEx
		System.out.println(2);
	}
	public static void test1() throws ClassNotFoundException {
		System.out.println(3);
			Class.forName(""); // it is checked tyoe statement it is required try and catch block for handling

		System.out.println(4);
	}
}
