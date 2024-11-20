package app58;
interface H<DataType>{
	DataType test1();
	void test2(DataType t1);
	void test3(DataType d1, DataType d2);
}

class I implements H <String >{

	@Override
	public String test1() {
		System.out.println("test1");
		return "abc";
	}

	@Override
	public void test2(String t1) {
		System.out.println("test2" + t1);
		
	}

	@Override
	public void test3(String d1, String d2) {
		System.out.println("test3: " + d1 + ", " + d2);
		
	}
	
}
class J implements H<Integer>{

	@Override
	public Integer test1() {
		System.out.println("done");
		return 12;
	}

	@Override
	public void test2(Integer t1) {
		System.out.println("test2:" + t1);
		
	}

	@Override
	public void test3(Integer d1, Integer d2) {
		System.out.println("test3" + d1 + ", " + d2);
		
	}
	
}
public class M8 {
	public static void main(String[] args) {
		I obj = new I();
		obj.test2("abc");
		obj.test3("abc", "axv");
		System.out.println("obj.test1()");
		J obj1 = new J();
		System.out.println("----------------");
		System.out.println("obj1.test1()");
		obj1.test1();
		obj1.test2(12);
		obj1.test3(1, 12);
	}
	
}
