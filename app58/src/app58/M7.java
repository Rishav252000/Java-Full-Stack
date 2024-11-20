package app58;
class G<A, B>{
	A s1;
	B s2;
	
	void test1(A arg1, B arg2) {
		System.out.println("done");
	}
	
}
public class M7 {
	public static void main(String[] args) {
		G<String, Integer> g1 = new G<String, Integer>();
		g1.s1 = "abc";
		g1.s2 = 345;
		
		G<Integer, Integer> g2 = new G<Integer, Integer>();
		g2.s1 = 12;
		g2.s2 = 345;
		
		G<Integer, String> g3 = new G<Integer, String>();
		g3.s1 = 1234;
		g3.s2 = "345";
		
		g1.test1("abc", 12);
		g2.test1(12, 12);
		g3.test1(12 , "asd");
	}
}
