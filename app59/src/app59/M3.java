package app59;
class C{
	int i;
	C(int i){
		this.i = i;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i = " + i;
	}
}
public class M3 {
	public static void main(String[] args) {
		C c1 = new C(90);
		System.out.println(c1);
	}
}
