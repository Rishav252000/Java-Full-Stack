package ObjectClass;

public class Test {
	int i ;
	int j ;
	
	public static void main(String[] args) {
		Test t1=new Test();
		t1.i=10;
		t1.j=20;
		Test t2=new Test();
		t2.i=30;
		t2.j=40;
		System.out.println(t1);
		System.out.println(t2.toString());
		
	}
}
