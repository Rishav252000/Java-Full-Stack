package app59;
class F{
	int i;
	int j;
	int k;
	
	F(int i, int j, int k){
		this.i = i;
		this.j = j;
		this.k = k;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return (obj instanceof F) &&
				(i == ((F) obj).i) &&
				(j == ((F) obj).j) &&
				(k == ((F) obj).k);
	}
}
public class M6 {
	public static void main(String[] args) {
		F f1 = new F(10, 30, 200);
		F f2 = new F(10, 30, 200);
		System.out.println(f1.equals(f2));
		System.out.println(f1.equals("abc"));
		System.out.println(f1.equals(34));
	}
}
