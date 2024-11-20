package app59;
class E{
	int i;
	int j;
	
	E(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof E)) {
			return false;
		}
		E ref = (E) obj;
		boolean flag = this.i == ref.i && this.j == ref.j;
		return flag;
	}
}
public class M5 {
	public static void main(String[] args) {
		E e1 = new E(10, 30);
		E e2 = new E(10, 30);
		System.out.println("double equals "+  (e1 == e2));
		System.out.println(e1.equals(e2));  //e2 asssigning to obj and e1 assign to this.
	//	System.out.println(e1.equals("abc"));  //e2 asssigning to obj and e1 assign to this.
		System.out.println(e1.equals(10));  //e2 asssigning to obj and e1 assign to this.
		
	}
}
