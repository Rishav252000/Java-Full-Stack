package app59;
class B{
	int i;
	int j;
	public B(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
}
public class M2 {
	public static void main(String[] args) {
		B b1 = new B(10, 20);
		System.out.println(b1);
		
		B b2 = new B(101, 201);
		System.out.println(b2);
	}
}
