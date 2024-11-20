package app53;

public class H {
	public static void main(String[] args) {
		String sh = "10.523D";
		short s1 = Short.parseShort("10");
		byte i = 101;
		byte b1 = Byte.valueOf(i);
		int b2 = Integer.parseInt("10");
		double b3 = Double.parseDouble(sh);
		float b4 = Float.parseFloat("14.54F");
		float b5 = Float.valueOf(12.5F);
		System.out.println(s1);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
	}
}
