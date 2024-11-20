package app61;
class A implements Cloneable{
	int i;
//	void test () throws CloneNotSupportedException{
//		A a = (A) clone();
//	}
	
	public Object clone () throws CloneNotSupportedException{
		
		return super.clone();
		
	}
}
public class M1{
	public static void main(String[] args) throws Throwable{
		A a1 = new A();
		a1.i = 100;
		A a2 = (A) a1.clone();
		
		a1.i = 111;
		
		a1.i = 123;
		
		System.out.println(a1.i);
		System.out.println(a2.i);
		
	}
}
