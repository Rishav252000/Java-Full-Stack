package app58;
class A{
	String s1;
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.s1 = "abc";
		
		A a2 = new A();
		a1.s1 = "xyz";
		
		A a3 = new A();
		a1.s1 = "pqr";
		
		A a4 = new A();
		a1.s1 = "uvx";
		System.out.println("done");
	}
}
