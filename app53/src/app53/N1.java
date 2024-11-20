package app53;

public class N1 {
	public static void main(String[] args) {
		boolean b1 = new Boolean(true);
		boolean b2 = new Boolean(true);
		boolean b3 = true;
		boolean b4 = true;
		System.out.println(b1 == b2);
		System.out.println(b1 == b3);
		System.out.println(b3 == b4);
		System.out.println(b1 == b4);
	}
}
