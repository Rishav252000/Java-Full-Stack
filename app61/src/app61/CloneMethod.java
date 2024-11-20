package app61;
class MyCopy implements Cloneable{
	int i;
	public Object clone () throws CloneNotSupportedException{
		return super.clone();
	}
}
public class CloneMethod {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		MyCopy m = new MyCopy();
		m.i = 100;
		MyCopy m2 = (MyCopy) m.clone();
		m.i = 100;
		System.out.println(m.i);
	}
}
