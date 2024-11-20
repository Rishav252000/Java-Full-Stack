package pack1;
class  A
{
	
}
class B extends A{
	
}
public class M1 extends B{
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = (B) a1;
	}
}
