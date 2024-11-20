package app54;

public class M1h {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println("try begin");
			int i = Integer.parseInt("abc");
			System.out.println("try end");
		}
		catch(NumberFormatException ex) {
			System.out.println(55);
			int j = 30;
			System.out.println(66);
		}
//		System.out.println(j);
//		System.out.println(2);
//		System.out.println(ex);
	}
}
