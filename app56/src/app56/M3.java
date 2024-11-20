package app56;
interface C{
	int test(int i, int j);
}
public class M3 {
	public static void main(String[] args) {
		C c1 = (i, j) -> 40;
		System.out.println(c1.test(10, 51));
		
		
		C c2 = (i, j) -> i + j;
		System.out.println(c2.test(1110, 51));
		
		C c3 = (i, j) -> {
			System.out.println(c2.test(10, 51));
			return i+j;
		};
		System.out.println(c3.test(1230, 1230));
	}
}
