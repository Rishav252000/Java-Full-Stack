package app60;
class A{
	
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = a1;
		a1 = null;//object is becoming abandoned
		a2 = null;//object is becoming abandoned
	}
}
