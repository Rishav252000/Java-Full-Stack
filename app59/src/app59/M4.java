package app59;
class D{
	int i;
	D(int i){
		this.i = i;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(!(obj instanceof D))
//		{
//			return false;
//				
//		}
//		D ref = (D)obj;
//		boolean flag = ref.i == this.i;
//		return flag;
//	}
}
public class M4 {
	public static void main(String[] args) {
		D d1 = new D(50);
		D d2 = new D(50);
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(d1 == d2); // double operator between the ref its checks booth are the refering same object or diff object double, its checks weather value are same or not  
		System.out.println(d1.i == d2.i);// object class eqals internally using double equals operator between the references that is D1 or D2
		System.out.println("equals method "+d1.equals(d2));
		System.out.println(str1.equals(str2));
			
		D d3 = d1;
		System.out.println("double equal  " + ( d1 == d3));
		System.out.println("d3 = d1; "+d1.equals(d3));
	}
}
