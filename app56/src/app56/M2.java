package app56;
interface B{
	
	void test(int i, int j);
	
}
public class M2 {
	
	public static void main(String[] args) {
		B b1 = (int i, int j) -> System.out.println(i + " AIC " + j);
		b1.test(10, 10);
		
		System.out.println("---------");
		
		B b2 = (i,  j) -> System.out.println(i + " AIC " + j);
		b2.test(101, 101);
		
		System.out.println("---------");
		
		B b3 = (i,  j) -> {
		System.out.println(i + " X "  + j + " Y");
		System.out.println(i + " X "  + j + " Y");
		System.out.println(i + " X "  + j + " Y");
		System.out.println(i + " X "  + j + " Y");
		System.out.println(i + " X "  + j + " Y");
		System.out.println(i + " X "  + j + " Y");
		};
		b3.test(11, 1111);
	}
	
}
