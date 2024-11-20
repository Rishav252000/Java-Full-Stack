package app61;
public class M7 implements Cloneable {
	int i = 20;
	int j = 14;
	public static void main(String[] args) throws CloneNotSupportedException{
		M7 a1 = new M7();
		M7 a2 = (M7)a1.clone();
		
		a2.i = 10;
		System.out.println(a2.i);
	}
}
