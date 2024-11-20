
package app58;
interface K<GEN>
{
	void test(GEN arg);
}

class L implements K <String>{
	public void test(String arg) {
		System.out.println("L-test1");
	}
}

class M implements K <Integer>
{
	public void test(Integer arg) {
		System.out.println("M-test1");
	}
}
 
class N <Test>implements K <Test>
{
	@Override
	public void test(Test arg) {
		
	}
}

public class M9 {
	public static void main(String[] args) {
		L obj1 = new L();
		obj1.test("abc");
		
		M obj2 = new M();
		obj2.test(34);
		
		N<Double> obj3 = new N<Double>();
		obj3.test(1.2);
		
		N<Boolean> obj4 = new N<Boolean>();
		obj4.test(true);
		
		N<String> obj5 = new N<String>();
		obj5.test("true");
	}
}
