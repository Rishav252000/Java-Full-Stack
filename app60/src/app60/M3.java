package app60;
class C{
	C obj;
}
public class M3 {
	public static void main(String[] args) {
		C c1 = new C();
		C c2 = new C();
		C c3 = new C();
		C c4 = new C();
		
		c1.obj = c2;
		c2.obj = c3;
		c3.obj = c4;
		
		c1 = c2 = c3 = c4 = null;
		System.out.println(c1);
	}
}
