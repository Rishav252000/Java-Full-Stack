package app58;
class O< A >{
	A atr;
	
}
class P < B extends Number >{
	B atr;
	void setValue(B atr)
	{
		this.atr = atr;
		System.out.println("Class P genric value : " + atr);
	}
	public B getValue()
	{
	 return atr;
	}
}
public class M10 {
	public static void main(String[] args) {
		O<String> o1 = new O<String>();
		o1.atr = "abc";
		
		O<Integer> o2 = new O<Integer>();
		o2.atr = 12;
		
//		P<String> p3 = new P<String>();
//		p3.atr = "xyz";
		
		P<Integer> p2 = new P<Integer>();
		o2.atr = 12;
		p2.setValue(233);
		
		P<Double> p3 = new P<Double>();
		p3.atr = 12.2;
	}
}
