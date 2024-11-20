package lamdaExp;
interface A {
	int test(int i, int j);
}

interface B {
	void test(int i, int j);
}
interface  C{
	abstract void test4(int i, int j, int k);
}
public class M1 {
	public static void main(String[] args) {
		A a1 = (i, j) -> i + j;
		B a2 = (i, j) -> 
		{
			int m = i + j;
			System.out.println(m);
		};
		C c1 = (i, j, k) ->
		{
			int m = i + j;
			System.out.println(m);
		};
		
		
		a2.test(123, 233);
	}
}
